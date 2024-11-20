package com.veterinario.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table(name="CLIENTES")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String apellidoMaterno;
    private String apellidoPaterno;
    private String estatus; 
    private int id_direccion;
    private int id_contacto;
    public Cliente(int id, String nombre, String apellidoMaterno, String apellidoPaterno, String estatus,
            int id_direccion, int id_contacto) {
        this.id = id;
        this.nombre = nombre;
        this.apellidoMaterno = apellidoMaterno;
        this.apellidoPaterno = apellidoPaterno;
        this.estatus = estatus;
        this.id_direccion = id_direccion;
        this.id_contacto = id_contacto;
    }
    public Cliente() {
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
    public String getApellidoMaterno() {
        return apellidoMaterno;
    }
    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }
    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }
    public String getEstatus() {
        return estatus;
    }
    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }
    public int getId_direccion() {
        return id_direccion;
    }
    public void setId_direccion(int id_direccion) {
        this.id_direccion = id_direccion;
    }
    public int getId_contacto() {
        return id_contacto;
    }
    public void setId_contacto(int id_contacto) {
        this.id_contacto = id_contacto;
    }
    @Override
    public String toString() {
        return "Cliente [id=" + id + ", nombre=" + nombre + ", apellidoMaterno=" + apellidoMaterno
                + ", apellidoPaterno=" + apellidoPaterno + ", estatus=" + estatus + ", id_direccion=" + id_direccion
                + ", id_contacto=" + id_contacto + "]";
    }
}
