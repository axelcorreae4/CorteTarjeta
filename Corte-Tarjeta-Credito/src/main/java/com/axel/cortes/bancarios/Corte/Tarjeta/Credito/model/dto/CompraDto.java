package com.axel.cortes.bancarios.Corte.Tarjeta.Credito.model.dto;

import com.axel.cortes.bancarios.Corte.Tarjeta.Credito.model.entity.Corte;
import com.axel.cortes.bancarios.Corte.Tarjeta.Credito.model.entity.Persona;
import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class CompraDto {
    private Integer id;
    private String nombreCompra;
    private Double costoCompra;
    private Integer idPersona;
    private Integer idCorte;
}
