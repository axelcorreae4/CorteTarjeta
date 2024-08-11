package com.axel.cortes.bancarios.Corte.Tarjeta.Credito.model.dao;

import com.axel.cortes.bancarios.Corte.Tarjeta.Credito.model.entity.Corte;
import org.springframework.data.repository.CrudRepository;

public interface CorteDao extends CrudRepository<Corte,Integer> {
}
