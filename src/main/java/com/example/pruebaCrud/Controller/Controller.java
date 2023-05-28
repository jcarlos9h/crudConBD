package com.example.pruebaCrud.Controller;

import com.example.pruebaCrud.Entity.Persona;
import com.example.pruebaCrud.Service.PersonaServiceIMPL.PSIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // para que spring lo reconozaca como una clase controller
@RequestMapping("crudrepo")

public class Controller {

    // creamos un objeto de tipo clase

    @Autowired
    private PSIMPL impl;

    @GetMapping
    @RequestMapping(value = "consultarPersonas", method = RequestMethod.GET)
    public ResponseEntity<?> consultarPersonas(){
        List<Persona> listaPersona=this.impl.consultarPersona();
        return  ResponseEntity.ok(listaPersona);
    }

    @PostMapping
    @RequestMapping(value ="crearPersonas", method = RequestMethod.POST)
    public ResponseEntity<?> crearPersonas(@RequestBody  Persona persona) {
        Persona personaCreada = this.impl.crearPersona(persona);
        return  ResponseEntity.status(HttpStatus.CREATED).body(personaCreada);
    }

    @PutMapping
    @RequestMapping(value ="modificarPersonas", method = RequestMethod.PUT)
    public ResponseEntity<?> modificarPersonas(@RequestBody Persona persona ) {
        Persona personamodificada = this.impl.modificarPersona(persona);
        return  ResponseEntity.status(HttpStatus.CREATED).body(personamodificada);
    }

    @GetMapping
    @RequestMapping(value ="buscarPersona/{id}", method = RequestMethod.GET)
    //{id} le decimos al c que tenga en cuenta el id
    public ResponseEntity<?> buscarPersona(@PathVariable int id ) {
        Persona personaencontrada = this.impl.buscarrPersona(id);
        return  ResponseEntity.ok(personaencontrada);
    }
    @DeleteMapping
    @RequestMapping(value ="eliminarPersona/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> eliminarPersona(@PathVariable int id ) {
     this.impl.eliminarPersona(id);
        return  ResponseEntity.ok().build();
    }

}
