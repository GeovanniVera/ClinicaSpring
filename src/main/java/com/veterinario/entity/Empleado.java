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
    @Column(name = "fecha_de_inicio")
    private String fechaInicio;
    private String imagen = "empleado.jpg";
    private String nombre;
    @Column(name = "apellido_materno")
    private String apellidoPaterno;
    @Column(name = "apellido_paterno")
    private String apellidoMaterno;
    @Column(name = "cedula_profesional")
    private String cedulaProfesional;
    private String rol;
    private String estatus;
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
    @Override
    public String toString() {
        return "Empleado [id=" + id +  ", fechaInicio=" + fechaInicio + ", imagen="
                + imagen + ", nombre=" + nombre + ", apellidoPaterno=" + apellidoPaterno + ", apellidoMaterno="
                + apellidoMaterno + ", cedulaProfesional=" + cedulaProfesional + ", rol=" + rol + ", estatus=" + estatus
                + ", telefonoMovil=" + telefonoMovil + ", telefonoFijo=" + telefonoFijo + ", correoElectronico="
                + correoElectronico + "]";
    }
    
}
