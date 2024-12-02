package com.veterinario.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="servicios")
public class Servicio {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "nombre_servicio")
    private String nombre;
    private String descripcion;
    @Column(name = "costo_servicio")
    private double costoServicio;
    private String imagen = "perro.jpg";
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
    public double getCostoServicio() {
        return costoServicio;
    }
    public void setCostoServicio(double costoServicio) {
        this.costoServicio = costoServicio;
    }
    public String getImagen() {
        return imagen;
    }
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    @Override
    public String toString() {
        return "Servicio [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", costoServicio="
                + costoServicio + ", imagen=" + imagen + "]";
    }
    
}
