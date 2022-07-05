package com.microservice.forneccedor.controller;


import java.util.List;

import com.microservice.forneccedor.DTO.ItemDoPedidoDTO;
import com.microservice.forneccedor.model.Pedido;
import com.microservice.forneccedor.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("pedido")
public class PedidoController {
    @Autowired
    private PedidoService pedidoService;

    @RequestMapping(method = RequestMethod.POST)
    public Pedido realizaPedido(@RequestBody List<ItemDoPedidoDTO> produtos) {
        return pedidoService.realizaPedido(produtos);
    }

    @RequestMapping("/{id}")
    public Pedido getPedidoPorId(@PathVariable Long id) {
        return pedidoService.getPedidoPorId(id);
    }
}
