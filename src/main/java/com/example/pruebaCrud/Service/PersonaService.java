package com.example.pruebaCrud.Service;

import com.example.pruebaCrud.Entity.Persona;

import java.util.List;

public interface PersonaService {

    public List<Persona> consultarPersona();

    public Persona crearPersona(Persona persona);

    public Persona modificarPersona(Persona persona);

    public Persona buscarrPersona(int id);

    public void eliminarPersona(int id);


}