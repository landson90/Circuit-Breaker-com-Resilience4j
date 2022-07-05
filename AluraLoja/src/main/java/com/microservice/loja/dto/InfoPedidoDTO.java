package com.microservice.loja.dto;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class InfoPedidoDTO {


    private Long id;
    private Integer tempoDePreparo;
}
