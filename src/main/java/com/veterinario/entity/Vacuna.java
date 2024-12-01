package com.veterinario.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "vacunas")
public class Vacuna {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne
    @JoinColumn(name = "id_fabricante")
    private Fabricante fabricante;
  
    @Column(name = "tipo_vacuna")
    private String TipoVacuna;

    private String nombre;
    @Column(name = "dosis_requerida")
    private double dosisRequerida;

    @Column(name = "costo_unitario")
    private double costoUnitario;
    
    public double getCostoUnitario() {
        return costoUnitario;
    }
    public void setCostoUnitario(double costoUnitario) {
        this.costoUnitario = costoUnitario;
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
    public double getDosisRequerida() {
        return dosisRequerida;
    }
    public void setDosisRequerida(double dosisRequerida) {
        this.dosisRequerida = dosisRequerida;
    }
    
    public Fabricante getFabricante() {
        return fabricante;
    }
    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }
    public String getTipoVacuna() {
        return TipoVacuna;
    }
    public void setTipoVacuna(String tipoVacuna) {
        TipoVacuna = tipoVacuna;
    }
    @Override
    public String toString() {
        return "Vacuna [id=" + id + ", fabricante=" + fabricante + ", TipoVacuna=" + TipoVacuna + ", nombre=" + nombre
                + ", dosisRequerida=" + dosisRequerida + ", costoUnitario=" + costoUnitario + "]";
    }
    
    
    
    
}
