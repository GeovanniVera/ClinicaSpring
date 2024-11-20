package com.veterinario.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="TRATAMIENTOS")
public class Tratamiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String descripcion;
    private int dias_duracion;
    public Tratamiento(int id, String nombre, String descripcion, int dias_duracion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.dias_duracion = dias_duracion;
    }
    public Tratamiento() {
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
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public int getDias_duracion() {
        return dias_duracion;
    }
    public void setDias_duracion(int dias_duracion) {
        this.dias_duracion = dias_duracion;
    }
    @Override
    public String toString() {
        return "Tratamiento [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", dias_duracion="
                + dias_duracion + "]";
    }
    
}
