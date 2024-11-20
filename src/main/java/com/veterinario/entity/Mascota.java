package com.veterinario.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="MASCOTAS")
public class Mascota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int id_cliente;
    private String nombre;
    private String tipo;
    private String raza;
    private String sexo;
    private String color;
    private String fecha_de_nacimiento;
    private double talla;
    private double peso;
    private String estatus;
    public Mascota(int id, int id_cliente, String nombre, String tipo, String raza, String sexo, String color,
            String fecha_de_nacimiento, double talla, double peso, String estatus) {
        this.id = id;
        this.id_cliente = id_cliente;
        this.nombre = nombre;
        this.tipo = tipo;
        this.raza = raza;
        this.sexo = sexo;
        this.color = color;
        this.fecha_de_nacimiento = fecha_de_nacimiento;
        this.talla = talla;
        this.peso = peso;
        this.estatus = estatus;
    }
    public Mascota() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId_cliente() {
        return id_cliente;
    }
    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getFecha_de_nacimiento() {
        return fecha_de_nacimiento;
    }
    public void setFecha_de_nacimiento(String fecha_de_nacimiento) {
        this.fecha_de_nacimiento = fecha_de_nacimiento;
    }
    public double getTalla() {
        return talla;
    }
    public void setTalla(double talla) {
        this.talla = talla;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public String getEstatus() {
        return estatus;
    }
    public void setEstarus(String estatus) {
        this.estatus = estatus;
    }
    @Override
    public String toString() {
        return "Mascota [id=" + id + ", id_cliente=" + id_cliente + ", nombre=" + nombre + ", tipo=" + tipo + ", raza="
                + raza + ", sexo=" + sexo + ", color=" + color + ", fecha_de_nacimiento=" + fecha_de_nacimiento
                + ", talla=" + talla + ", peso=" + peso + ", estatus=" + estatus + "]";
    }


}
