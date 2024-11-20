package com.veterinario.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "VACUNAS")
public class Vacuna {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private int id_fabricante;
    private int id_insumo;
    private String nombre;
    private int dosis_requerida;
    public Vacuna(int id, int id_fabricante, int id_insumo, String nombre, int dosis_requerida) {
        this.id = id;
        this.id_fabricante = id_fabricante;
        this.id_insumo = id_insumo;
        this.nombre = nombre;
        this.dosis_requerida = dosis_requerida;
    }
    public Vacuna() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId_fabricante() {
        return id_fabricante;
    }
    public void setId_fabricante(int id_fabricante) {
        this.id_fabricante = id_fabricante;
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
    public int getDosis_requerida() {
        return dosis_requerida;
    }
    public void setDosis_requerida(int dosis_requerida) {
        this.dosis_requerida = dosis_requerida;
    }
    @Override
    public String toString() {
        return "Vacuna [id=" + id + ", id_fabricante=" + id_fabricante + ", id_insumo=" + id_insumo + ", nombre="
                + nombre + ", dosis_requerida=" + dosis_requerida + "]";
    }

    
}
