package com.microservice.forneccedor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.forneccedor.model.InfoFornecedor;
import com.microservice.forneccedor.repository.InfoRepository;

@Service
public class InfoService {

	@Autowired
	private InfoRepository respository;
	
	public InfoFornecedor getInfoPorEstado(String estado) {
		return this.respository.findByEstado(estado);
	}
}
