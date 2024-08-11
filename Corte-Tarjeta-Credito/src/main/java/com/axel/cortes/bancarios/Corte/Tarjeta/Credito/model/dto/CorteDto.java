package com.axel.cortes.bancarios.Corte.Tarjeta.Credito.model.dto;

import com.axel.cortes.bancarios.Corte.Tarjeta.Credito.model.entity.Compra;
import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class CorteDto {

    private Integer id;
    private Integer mes;
    private Integer anio;
    private Integer idCompra;
}
