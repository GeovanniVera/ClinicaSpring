package com.veterinario.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table(name="clientes")
public class Cliente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    @Column(name = "apellido_materno")
    private String apellidoMaterno;
    @Column(name = "apellido_paterno")
    private String apellidoPaterno;
    private String estatus; 
    @Column(name = "telefono_movil")
    private long telefonoMovil;
    @Column(name = "telefono_fijo")
    private long telefonoFijo;
    @Column(name = "correo_electronico")
    private String correoElectronico;
    private int numero;
    private String calle;
    private String colonia;
    @Column(name = "codigo_postal")
    private String codigoPostal;
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
    public String getTelefonoMovil() {
        return String.valueOf(telefonoMovil);
    }
    public void setTelefonoMovil(String telefonoMovil) {
        if(telefonoMovil != null && !telefonoMovil.isEmpty()){
            this.telefonoMovil = Long.parseLong(telefonoMovil);
        }
    }
    public String getTelefonoFijo() {
        return String.valueOf(telefonoFijo);
    }
    public void setTelefonoFijo(String telefonoFijo) {
        if(telefonoFijo != null && !telefonoFijo.isEmpty()){
            this.telefonoFijo = Long.parseLong(telefonoFijo);
        }
    }
    public String getCorreoElectronico() {
        return correoElectronico;
    }
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getCalle() {
        return calle;
    }
    public void setCalle(String calle) {
        this.calle = calle;
    }
    public String getColonia() {
        return colonia;
    }
    public void setColonia(String colonia) {
        this.colonia = colonia;
    }
    public String getCodigoPostal() {
        return codigoPostal;
    }
    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
    @Override
    public String toString() {
        return "Cliente [id=" + id + ", nombre=" + nombre + ", apellidoMaterno=" + apellidoMaterno
                + ", apellidoPaterno=" + apellidoPaterno + ", estatus=" + estatus + ", telefonoMovil=" + telefonoMovil
                + ", telefonoFijo=" + telefonoFijo + ", correoElectronico=" + correoElectronico + ", numero=" + numero
                + ", calle=" + calle + ", colonia=" + colonia + ", codigoPostal=" + codigoPostal + "]";
    }
}
