package com.veterinario.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "vacunas")
public class Vacuna {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_vacuna")
    private int id;
    @Column(name = "id_fabricante")
    private int idFabricante;
    @Column(name = "id_insumo")
    private int id_insumo;
    private String nombre;
    @Column(name = "dosis_requerida")
    private int dosisRequerida;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getIdFabricante() {
        return idFabricante;
    }
    public void setIdFabricante(int idFabricante) {
        this.idFabricante = idFabricante;
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
    public int getDosisRequerida() {
        return dosisRequerida;
    }
    public void setDosisRequerida(int dosisRequerida) {
        this.dosisRequerida = dosisRequerida;
    }
    
}
