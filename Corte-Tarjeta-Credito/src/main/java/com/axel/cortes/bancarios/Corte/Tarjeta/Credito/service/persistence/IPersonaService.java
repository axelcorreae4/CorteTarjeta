package com.axel.cortes.bancarios.Corte.Tarjeta.Credito.service.persistence;

import com.axel.cortes.bancarios.Corte.Tarjeta.Credito.model.dto.PersonaDto;
import com.axel.cortes.bancarios.Corte.Tarjeta.Credito.model.entity.Persona;

public interface IPersonaService {

    Persona registrarPersona(PersonaDto personaDto);
    PersonaDto buscarPersonaDto(Integer id);
    Persona buscarPersona(Integer id);
}
