package com.veterinario.entity;

import java.time.LocalDate;

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
    private int id;
    private String nombre;
    private String descripcion;
    private LocalDate fecha_diagnostico;
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
    public LocalDate getFecha_diagnostico() {
        return fecha_diagnostico;
    }
    public void setFecha_diagnostico(LocalDate fecha_diagnostico) {
        this.fecha_diagnostico = fecha_diagnostico;
    }
    @Override
    public String toString() {
        return "Diagnostico [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", fecha_diagnostico="
                + fecha_diagnostico + "]";
    }
}
