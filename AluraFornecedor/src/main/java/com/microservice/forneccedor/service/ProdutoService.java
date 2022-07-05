package com.microservice.forneccedor.service;


import com.microservice.forneccedor.model.Produto;
import com.microservice.forneccedor.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> getProdutosPorEstado(String estado) {
        return produtoRepository.findByEstado(estado);
    }

}
