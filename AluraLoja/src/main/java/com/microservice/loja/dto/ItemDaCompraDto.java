package com.microservice.loja.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


public class ItemDaCompraDto {

	private Long id;
	private int quantidade;

	
	public ItemDaCompraDto() {
	}
	public ItemDaCompraDto(Long id, int quantidade) {
		this.id = id;
		this.quantidade = quantidade;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
	
	
	
	
}
