package com.veterinario.services;

import java.util.List;

import com.veterinario.entity.Cliente;

public interface InClienteServices {
    public List<Cliente> obtenerClientes();
    public void guardarCliente(Cliente cliente);
    public void eliminarCliente(Integer idCliente);
    public Cliente buscarPorId(Integer idCliente);
    public int totalClientes();
}
