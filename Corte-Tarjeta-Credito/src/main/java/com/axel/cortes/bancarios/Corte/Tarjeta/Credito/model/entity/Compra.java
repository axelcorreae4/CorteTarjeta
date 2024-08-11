package com.axel.cortes.bancarios.Corte.Tarjeta.Credito.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "compra")
public class Compra {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id",nullable = false)
    private Integer idCompra;
    @Column(nullable = false)
    private String nombre;
    @Column(nullable = false)
    private Double costo;
    @ManyToOne()
    @JoinColumn(name = "idPersona")
    private Persona persona;
    @ManyToOne()
    @JoinColumn(name = "idCorte")
    private Corte corte;

}
