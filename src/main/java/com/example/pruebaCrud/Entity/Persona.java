package com.example.pruebaCrud.Entity;

import jakarta.persistence.*;

@Entity //anotacion para que spring reconozca esta clase como una entidad.
@Table(name = "Humano")
public class Persona {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
    private int id;
@Column(name = "nombre")
    private String nombre;
  @Column(name = "apellido")
    private String apellido;
  @Column(name = "edad")
    private int edad;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellido() {
    return apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }
}

