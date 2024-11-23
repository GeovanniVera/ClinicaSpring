package com.veterinario.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="cirugias")
public class Cirugia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cirugia")
    private int id;
    private String nombre;
    public Cirugia(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    public Cirugia() {
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
        return "Cirugia [id=" + id + ", nombre=" + nombre + "]";
    }
    
}
