package com.veterinario.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="inventario")
public class Inventario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private double costo;
    private int cantidad;
    private String estatus;
    
    @OneToOne
    @JoinColumn(name = "id_Insumo")
    private Insumo insumo;

    public Inventario(int id, String nombre, double costo, int cantidad, String estatus, Insumo insumo) {
        this.id = id;
        this.nombre = nombre;
        this.costo = costo;
        this.cantidad = cantidad;
        this.estatus = estatus;
        this.insumo = insumo;
    }

    public Inventario() {
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

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public Insumo getInsumo() {
        return insumo;
    }

    public void setInsumo(Insumo insumo) {
        this.insumo = insumo;
    }

    @Override
    public String toString() {
        return "Inventario [id=" + id + ", nombre=" + nombre + ", costo=" + costo + ", cantidad=" + cantidad
                + ", estatus=" + estatus + ", insumo=" + insumo + "]";
    }
    
   

}
