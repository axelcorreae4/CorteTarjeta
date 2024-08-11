package com.axel.cortes.bancarios.Corte.Tarjeta.Credito.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "persona")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Integer idPersona;
    @Column(nullable = false)
    private String nombre;
    @Column(nullable = false)
    private String apellidoP;
    @Column(nullable = false)
    private String apellidoM;
    @OneToMany(mappedBy = "persona", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Compra> compras;

}
