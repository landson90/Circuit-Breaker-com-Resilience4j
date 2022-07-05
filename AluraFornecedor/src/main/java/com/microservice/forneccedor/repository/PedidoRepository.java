package com.microservice.forneccedor.repository;

import com.microservice.forneccedor.model.Pedido;
import org.springframework.data.repository.CrudRepository;

public interface PedidoRepository extends CrudRepository<Pedido, Long> {

}