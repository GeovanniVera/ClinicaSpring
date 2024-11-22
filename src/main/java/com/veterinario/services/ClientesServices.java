package com.veterinario.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.veterinario.entity.Cliente;
import com.veterinario.repository.ClientesRepository;
@Service
public class ClientesServices implements InClienteServices{
    @Autowired
    ClientesRepository repoClientes;
    @Override
    public List<Cliente> obtenerClientes() {
        return repoClientes.findAll();
    }

    @Override
    public void guardarCliente(Cliente cliente) {
        repoClientes.save(cliente);
    }

    @Override
    public void eliminarCliente(Integer idCliente) {
        repoClientes.deleteById(idCliente);
    }

    @Override
    public Cliente buscarPorId(Integer idCliente) {
        Cliente cliente = null;
        Optional<Cliente> optional = repoClientes.findById(idCliente);
        if(optional.isPresent()){
            cliente = optional.get();
        }
        return cliente;
    }

    @Override
    public int totalClientes() {
        return (int) repoClientes.count();
    }

}
