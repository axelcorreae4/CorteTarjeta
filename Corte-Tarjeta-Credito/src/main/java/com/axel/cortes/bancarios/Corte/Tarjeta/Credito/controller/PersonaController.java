package com.axel.cortes.bancarios.Corte.Tarjeta.Credito.controller;

import com.axel.cortes.bancarios.Corte.Tarjeta.Credito.model.dto.PersonaDto;
import com.axel.cortes.bancarios.Corte.Tarjeta.Credito.model.entity.Persona;
import com.axel.cortes.bancarios.Corte.Tarjeta.Credito.service.persistence.IPersonaService;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.crypto.Data;

@RestController
@RequestMapping("/api/v1/axel")
public class PersonaController {

    private IPersonaService iPersonaService;

    public PersonaController(IPersonaService iPersonaService) {
        this.iPersonaService = iPersonaService;
    }

    @PostMapping("/altaPersona")
    @ResponseStatus(HttpStatus.CREATED)
    ResponseEntity<?> altaPersona(@RequestBody PersonaDto personaDto){
        try{
            Persona persona = iPersonaService.registrarPersona(personaDto);
            if (persona == null){
                return new ResponseEntity<>("No se pudo registrar a la persona", HttpStatus.CREATED);
            }
            else {
                return new ResponseEntity<>("Registro exitoso", HttpStatus.OK);
            }

        }catch(DataAccessException ex){
            return new ResponseEntity<>("Error al registrar: "+ ex.getMessage(), HttpStatus.OK);
        }
    }

    @GetMapping("/buscaPersonaDto/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    ResponseEntity<?> buscaPersonaDto(@PathVariable Integer id){
        return new ResponseEntity<>(iPersonaService.buscarPersonaDto(id),HttpStatus.OK);
    }
}
