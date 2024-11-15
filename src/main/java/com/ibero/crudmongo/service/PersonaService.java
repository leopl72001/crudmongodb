/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ibero.crudmongo.service;

import com.ibero.crudmongo.model.Persona;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author leopl
 */
public interface PersonaService {

    List<Persona> getAllPersonas();

    Optional<Persona> getPersonaById(Long id);

    Persona savePersona(Persona Persona);

    void deletePersonaById(Long id);
}
