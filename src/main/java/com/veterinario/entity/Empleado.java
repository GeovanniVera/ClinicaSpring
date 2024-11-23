package com.veterinario.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="empleados")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_empleado")
    private int id;
    @Column(name = "id_contacto")
    private int idContacto;
    @Column(name = "fecha_de_inicio")
    private String fechaInicio;
    private String imagen;
    private String nombre;
    @Column(name = "apellido_materno")
    private String apellidoPaterno;
    @Column(name = "apellido_paterno")
    private String apellidoMaterno;
    @Column(name = "cedula_profesional")
    private String cedulaProfesional;
    private String rol;
    private String estatus;
    public Empleado(int id, int idContacto, String fechaInicio, String imagen, String nombre, String apellidoPaterno,
            String apellidoMaterno, String cedulaProfesional, String rol, String estatus) {
        this.id = id;
        this.idContacto = idContacto;
        this.fechaInicio = fechaInicio;
        this.imagen = imagen;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.cedulaProfesional = cedulaProfesional;
        this.rol = rol;
        this.estatus = estatus;
    }
    public Empleado() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getIdContacto() {
        return idContacto;
    }
    public void setIdContacto(int idContacto) {
        this.idContacto = idContacto;
    }
    public String getFechaInicio() {
        return fechaInicio;
    }
    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    public String getImagen() {
        return imagen;
    }
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }
    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }
    public String getApellidoMaterno() {
        return apellidoMaterno;
    }
    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }
    public String getCedulaProfesional() {
        return cedulaProfesional;
    }
    public void setCedulaProfesional(String cedulaProfesional) {
        this.cedulaProfesional = cedulaProfesional;
    }
    public String getRol() {
        return rol;
    }
    public void setRol(String rol) {
        this.rol = rol;
    }
    public String getEstatus() {
        return estatus;
    }
    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }
    @Override
    public String toString() {
        return "Empleado [id=" + id + ", idContacto=" + idContacto + ", fechaInicio=" + fechaInicio + ", imagen="
                + imagen + ", nombre=" + nombre + ", apellidoPaterno=" + apellidoPaterno + ", apellidoMaterno="
                + apellidoMaterno + ", cedulaProfesional=" + cedulaProfesional + ", rol=" + rol + ", estatus=" + estatus
                + "]";
    }
    
}
