package com.veterinario.services;

import java.util.List;

import com.veterinario.entity.Empleado;

public interface InEmpleadosServices {
    public List<Empleado> obtenerEmpleados();
    public void guardarEmpleado(Empleado empleado);
    public void eliminarEmpleado(Integer idEmpleado);
    public Empleado buscarPorId(Integer idEmpleado);
    public int totalEmpleados();
}
