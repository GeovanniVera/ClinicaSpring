package com.veterinario.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="SERVICIOS")
public class Servicio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre_serivicio;
    private String descripcion;
    private double precio_servicio;
    private String imagen;
    public Servicio(int id, String nombre_serivicio, String descripcion, double precio_servicio, String imagen) {
        this.id = id;
        this.nombre_serivicio = nombre_serivicio;
        this.descripcion = descripcion;
        this.precio_servicio = precio_servicio;
        this.imagen = imagen;
    }
    public Servicio() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre_serivicio() {
        return nombre_serivicio;
    }
    public void setNombre_serivicio(String nombre_serivicio) {
        this.nombre_serivicio = nombre_serivicio;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public double getPrecio_servicio() {
        return precio_servicio;
    }
    public void setPrecio_servicio(double precio_servicio) {
        this.precio_servicio = precio_servicio;
    }
    public String getImagen() {
        return imagen;
    }
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    @Override
    public String toString() {
        return "Servicio [id=" + id + ", nombre_serivicio=" + nombre_serivicio + ", descripcion=" + descripcion
                + ", precio_servicio=" + precio_servicio + ", imagen=" + imagen + "]";
    }
}
