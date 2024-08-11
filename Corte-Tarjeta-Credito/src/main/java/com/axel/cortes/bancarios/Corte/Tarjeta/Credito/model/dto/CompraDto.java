package com.axel.cortes.bancarios.Corte.Tarjeta.Credito.model.dto;

import lombok.*;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class CompraDto {
    private Integer id;
    private String nombreCompra;
    private Double costoCompra;
    private Date fechaCompra;
    private Integer idPersona;
    private Integer idCorte;
}
