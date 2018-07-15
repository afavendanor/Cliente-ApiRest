package com.bolsadeideas.springboot.apirest.models.services;

import java.util.List;

import com.bolsadeideas.springboot.apirest.models.entity.Cliente;

public interface IClienteService {
	
	public List<Cliente> findAll();
	
	public Cliente save(Cliente cliente);
	
	public Cliente findById(Long id);
	
	public void delete(Long id);
	
	public List<Cliente> findByApellido(String apellido);

}
