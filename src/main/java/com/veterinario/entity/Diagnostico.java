package com.veterinario.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="diagnosticos")
public class Diagnostico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_diagnostico")
    private int id;
    private String nombre;
    private String descripcion;
    private String fecha_diagnostico;
    public String getFecha_diagnostico() {
        return fecha_diagnostico;
    }
    public void setFecha_diagnostico(String fecha_diagnostico) {
        this.fecha_diagnostico = fecha_diagnostico;
    }
    public Diagnostico(int id, String nombre, String descripcion, String fecha_diagnostico) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha_diagnostico = fecha_diagnostico;
    }
    public Diagnostico() {
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
    @Override
    public String toString() {
        return "Diagnostico [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + "]";
    }
    
}
