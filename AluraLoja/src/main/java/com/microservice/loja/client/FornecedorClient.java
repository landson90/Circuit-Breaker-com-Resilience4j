package com.microservice.loja.client;

import com.microservice.loja.dto.InfoPedidoDTO;
import com.microservice.loja.dto.ItemDaCompraDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.microservice.loja.dto.InfoFornecedorDto;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient("fornecedor")
public interface FornecedorClient {

	@RequestMapping("/info/{estado}")
	InfoFornecedorDto getInfoPorEstado(@PathVariable String estado);

	@RequestMapping(method = RequestMethod.POST, value = "/pedido")
	InfoPedidoDTO realizarPedido(List<ItemDaCompraDto> item);
}
