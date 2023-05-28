package com.example.pruebaCrud.Repository;

import com.example.pruebaCrud.Entity.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaRepo  extends CrudRepository <Persona, Integer> {
}
