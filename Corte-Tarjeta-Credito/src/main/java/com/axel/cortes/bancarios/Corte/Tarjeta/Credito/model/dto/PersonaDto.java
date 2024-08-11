package com.axel.cortes.bancarios.Corte.Tarjeta.Credito.model.dto;

import com.axel.cortes.bancarios.Corte.Tarjeta.Credito.model.entity.Compra;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class PersonaDto {
    private Integer id;
    private String nombrePersona;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private Integer idCompra;
}
