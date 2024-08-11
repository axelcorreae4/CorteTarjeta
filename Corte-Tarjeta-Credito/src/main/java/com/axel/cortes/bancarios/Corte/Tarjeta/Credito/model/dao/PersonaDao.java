package com.axel.cortes.bancarios.Corte.Tarjeta.Credito.model.dao;

import com.axel.cortes.bancarios.Corte.Tarjeta.Credito.model.entity.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaDao extends CrudRepository<Persona, Integer> {
}
