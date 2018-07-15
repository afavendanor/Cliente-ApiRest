package com.bolsadeideas.springboot.apirest.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.bolsadeideas.springboot.apirest.models.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long>{

	@Query("select c from Cliente c where c.apellido like %?1%")
	public List<Cliente> findByApellido(String apellido);
	
}
