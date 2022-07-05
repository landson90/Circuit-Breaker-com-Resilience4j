package com.microservice.loja.service;

import com.microservice.loja.dto.InfoPedidoDTO;
import com.microservice.loja.model.Compra;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.microservice.loja.client.FornecedorClient;
import com.microservice.loja.config.ConfigRest;
import com.microservice.loja.dto.CompraDto;
import com.microservice.loja.dto.InfoFornecedorDto;

import java.util.HashMap;
import java.util.Map;

@Service
public class CompraService {



	@Autowired
	private RestTemplate client;
	
	@Autowired
	private FornecedorClient fornecedorClient;
	private final Map<Long, Compra> CACHE = new HashMap<>();
	@CircuitBreaker(name = "realizarCompra", fallbackMethod = "isErroAPI")
	public Compra realizarCompra(CompraDto dto) {
		var pedido = new InfoPedidoDTO();
		try {
			InfoFornecedorDto fornecedor = fornecedorClient.getInfoPorEstado(dto.getEndereco().getEstado());
			pedido = this.fornecedorClient.realizarPedido(dto.getItens());
			System.out.println("ESTADO DO FORNECEDOR ---- " + fornecedor.getEndereco());
		} catch (Exception e) {
			System.out.println(e);
		}
		Compra compraSalva = Compra.builder()
				.pedidoId(pedido.getId())
				.tempoDePreparo(pedido.getTempoDePreparo())
				.enderecoDestino(dto.getEndereco().toString())
				.build();
		return  compraSalva;
	}

	private void isErroAPI() {
		System.out.println("Porra");
	}

}
