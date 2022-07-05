package com.microservice.forneccedor.DTO;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ReservaDTO {

    public Integer idReserva;

    public Integer tempoDePreparo;

}
