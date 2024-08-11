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
@Table(name = "corte")
public class Corte {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ID", nullable = false)
    private Integer idCorte;
    @Column(name = "mes", nullable = false)
    private Integer mesCorte;
    @Column(name = "anio", nullable = false)
    private Integer anioCorte;
    @OneToMany(mappedBy = "corte", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Compra> compras;
}
