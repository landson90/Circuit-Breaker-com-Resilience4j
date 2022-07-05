package com.microservice.loja.dto;

import java.util.List;
import java.util.Objects;


public class CompraDto {

	private List<ItemDaCompraDto> itens;
	private EnderecoDto endereco;
	
	public CompraDto() {
	}
	
	
	public CompraDto(List<ItemDaCompraDto> itens, EnderecoDto endereco) {
		this.itens = itens;
		this.endereco = endereco;
	}
	public List<ItemDaCompraDto> getItens() {
		return itens;
	}
	public void setItens(List<ItemDaCompraDto> itens) {
		this.itens = itens;
	}
	public EnderecoDto getEndereco() {
		return endereco;
	}
	public void setEndereco(EnderecoDto endereco) {
		this.endereco = endereco;
	}
	@Override
	public int hashCode() {
		return Objects.hash(endereco);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CompraDto other = (CompraDto) obj;
		return Objects.equals(endereco, other.endereco);
	}
	
	
	
}
