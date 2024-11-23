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
    @Column(name = "id_servicio")
    private int id;
    @Column(name = "nombre_servicio")
    private String nombreSerivicio;
    private String descripcion;
    @Column(name = "precio_servicio")
    private double precioServicio;
    private String imagen;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombreSerivicio() {
        return nombreSerivicio;
    }
    public void setNombreSerivicio(String nombreSerivicio) {
        this.nombreSerivicio = nombreSerivicio;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public double getPrecioServicio() {
        return precioServicio;
    }
    public void setPrecioServicio(double precioServicio) {
        this.precioServicio = precioServicio;
    }
    public String getImagen() {
        return imagen;
    }
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    
}
