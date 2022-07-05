package com.microservice.loja.controller;

import com.microservice.loja.dto.ItemDaCompraDto;
import com.microservice.loja.model.Compra;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.microservice.loja.dto.CompraDto;
import com.microservice.loja.service.CompraService;

@RestController
@RequestMapping( "/compras")
public class CompraController {

	@Autowired
	private CompraService service;

	final static Logger logger = LoggerFactory.getLogger( CompraController.class);

	@PostMapping
	public ResponseEntity<Compra> realizarCompra(@RequestBody CompraDto dto) {
       var response = service.realizarCompra(dto);
	   return ResponseEntity.status(HttpStatus.CREATED).body(response);
	}

}
