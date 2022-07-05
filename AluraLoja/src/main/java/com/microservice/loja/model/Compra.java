package com.microservice.loja.model;


import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Compra {

    private Long pedidoId;
    private Integer tempoDePreparo;
    private String enderecoDestino;

}
