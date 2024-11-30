package com.veterinario.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "alergias")
public class Alergia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String sintomas;
    public String getSintomas() {
        return sintomas;
    }
    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }
    public Alergia(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    public Alergia() {
    }
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
    @Override
    public String toString() {
        return "Alergia [id=" + id + ", nombre=" + nombre + ", sintomas=" + sintomas + "]";
    }
    
}
