package com.veterinario.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "contactos")
public class Contacto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_contacto")
    private int id;
    @Column(name = "telefono_movil")
    private long telefonoMovil;
    @Column(name = "telefono_fijo")
    private long telefonoFijo;
    @Column(name = "correo_electronico")
    private String correoElectronico;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public long getTelefonoMovil() {
        return telefonoMovil;
    }
    public void setTelefonoMovil(long telefonoMovil) {
        this.telefonoMovil = telefonoMovil;
    }
    public long getTelefonoFijo() {
        return telefonoFijo;
    }
    public void setTelefonoFijo(long telefonoFijo) {
        this.telefonoFijo = telefonoFijo;
    }
    public String getCorreoElectronico() {
        return correoElectronico;
    }
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
}
