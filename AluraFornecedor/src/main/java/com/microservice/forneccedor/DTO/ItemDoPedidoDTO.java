package com.microservice.forneccedor.DTO;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ItemDoPedidoDTO {

    private long id;
    private int quantidade;
}
