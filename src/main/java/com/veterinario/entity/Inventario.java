package com.veterinario.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="INVENTARIO")
public class Inventario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int id_insumo;
    private String nombre;
    private double costo;
    private int cantidad;
    private String estatus;
    public Inventario(int id, int id_insumo, String nombre, double costo, int cantidad, String estatus) {
        this.id = id;
        this.id_insumo = id_insumo;
        this.nombre = nombre;
        this.costo = costo;
        this.cantidad = cantidad;
        this.estatus = estatus;
    }
    public Inventario() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId_insumo() {
        return id_insumo;
    }
    public void setId_insumo(int id_insumo) {
        this.id_insumo = id_insumo;
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
    @Override
    public String toString() {
        return "Inventario [id=" + id + ", id_insumo=" + id_insumo + ", nombre=" + nombre + ", costo=" + costo
                + ", cantidad=" + cantidad + ", estatus=" + estatus + "]";
    }


}
