package com.microservice.forneccedor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.forneccedor.model.InfoFornecedor;
import com.microservice.forneccedor.service.InfoService;

@RestController
@RequestMapping("/info")
public class InfoController {

	@Autowired
	private InfoService service;
	
	@RequestMapping("/{estado}")
	public ResponseEntity<InfoFornecedor> getInfoPorEstado(@PathVariable String estado) {
		InfoFornecedor response = this.service.getInfoPorEstado(estado);
		return ResponseEntity.ok().body(response);
	}
}
