package com.axel.cortes.bancarios.Corte.Tarjeta.Credito.service.persistence.Impl;

import com.axel.cortes.bancarios.Corte.Tarjeta.Credito.model.dao.PersonaDao;
import com.axel.cortes.bancarios.Corte.Tarjeta.Credito.model.dto.PersonaDto;
import com.axel.cortes.bancarios.Corte.Tarjeta.Credito.model.entity.Persona;
import com.axel.cortes.bancarios.Corte.Tarjeta.Credito.service.persistence.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersonaImplService implements IPersonaService {

    private PersonaDao personaDao;

    PersonaImplService(PersonaDao personaDao){
        this.personaDao = personaDao;
    }

    @Transactional
    @Override
    public Persona registrarPersona(PersonaDto personaDto) {
        Persona persona = Persona.builder()
                .idPersona(personaDto.getId())
                .nombre(personaDto.getNombrePersona())
                .apellidoP(personaDto.getApellidoPaterno())
                .apellidoM(personaDto.getApellidoMaterno())
                .build();
        return personaDao.save(persona);
    }

    @Override
    public PersonaDto buscarPersonaDto(Integer id) {
        //Buscamos a la persona
        Persona persona = personaDao.findById(id).orElse(null);
        PersonaDto personaDto = null;

        //Validamos si existe la persona y la parseamos a personaDTO, de lo contrario retornamos null
        if (persona != null){
            personaDto = PersonaDto.builder()
                    .id(persona.getIdPersona())
                    .nombrePersona(persona.getNombre())
                    .apellidoPaterno(persona.getApellidoP())
                    .apellidoMaterno(persona.getApellidoM())
                    .build();
        }

        return personaDto;
    }

    @Override
    public Persona buscarPersona(Integer id) {
        return personaDao.findById(id).orElse(null);
    }
}
