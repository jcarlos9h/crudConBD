package com.example.pruebaCrud.Service.PersonaServiceIMPL;

// esta clase va a aplicar los servicios

import com.example.pruebaCrud.Entity.Persona;
import com.example.pruebaCrud.Repository.PersonaRepo;
import com.example.pruebaCrud.Service.PersonaService;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PSIMPL implements PersonaService {

    @Autowired

    private PersonaRepo repo;


    @Override
    public List<Persona> consultarPersona() {
        return (List<Persona> )this.repo.findAll() ;
    }

    @Override
    public Persona crearPersona(Persona persona) {
     persona.setApellido(persona.getApellido());
     return this.repo.save(persona);

    }

    @Override
    public Persona modificarPersona(Persona persona) {
        return this.repo.save(persona);
    }

    @Override
    public Persona buscarrPersona(int id) {
        return this.repo.findById(id).get();
    }

    @Override
    public void eliminarPersona(int id) {
       this.repo.deleteById(id);
    }
}
