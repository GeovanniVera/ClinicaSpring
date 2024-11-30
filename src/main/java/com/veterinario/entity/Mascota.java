package com.veterinario.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="mascotas")
public class Mascota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @OneToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;
    
    private String nombre;
    private String imagen;
    private String tipo;
    private String raza;
    private String sexo;
    private String color;
    @Column(name = "fecha_de_nacimiento")
    private LocalDate fechadenacimiento;
    private double talla;
    private double peso;
    private String estatus;

    public Mascota(int id, Cliente cliente, String nombre, String imagen, String tipo, String raza, String sexo,
            String color, LocalDate fechadenacimiento, double talla, double peso, String estatus) {
        this.id = id;
        this.cliente = cliente;
        this.nombre = nombre;
        this.imagen = imagen;
        this.tipo = tipo;
        this.raza = raza;
        this.sexo = sexo;
        this.color = color;
        this.fechadenacimiento = fechadenacimiento;
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
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getImagen() {
        return imagen;
    }
    public void setImagen(String imagen) {
        this.imagen = imagen;
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
    public LocalDate getFechadenacimiento() {
        return fechadenacimiento;
    }
    public void setFechadenacimiento(LocalDate fechadenacimiento) {
        this.fechadenacimiento = fechadenacimiento;
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
    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }
    @Override
    public String toString() {
        return "Mascota [id=" + id + ", cliente=" + cliente + ", nombre=" + nombre + ", imagen=" + imagen + ", tipo="
                + tipo + ", raza=" + raza + ", sexo=" + sexo + ", color=" + color + ", fechadenacimiento="
                + fechadenacimiento + ", talla=" + talla + ", peso=" + peso + ", estatus=" + estatus + "]";
    }

}
