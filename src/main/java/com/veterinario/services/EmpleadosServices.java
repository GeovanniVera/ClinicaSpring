package com.veterinario.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.veterinario.entity.Empleado;
import com.veterinario.repository.EmpleadosRepository;

@Service
public class EmpleadosServices implements InEmpleadosServices{
    @Autowired
    private EmpleadosRepository repoEmpleados;

    @Override
    public List<Empleado> obtenerEmpleados() {
        return repoEmpleados.findAll();
    }

    @Override
    public void guardarEmpleado(Empleado empleado) {
        repoEmpleados.save(empleado);
    }

    @Override
    public void eliminarEmpleado(Integer idEmpleado) {
        repoEmpleados.deleteById(idEmpleado);
    }

    @Override
    public Empleado buscarPorId(Integer idEmpleado) {
        Empleado empleado = null;
        Optional<Empleado> optional = repoEmpleados.findById(idEmpleado);
        if(optional.isPresent()){
            empleado = optional.get();
        }
        return empleado;
    }

    @Override
    public int totalEmpleados() {
        return (int) repoEmpleados.count();
    }

}
