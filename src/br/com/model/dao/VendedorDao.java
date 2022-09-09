package br.com.model.dao;

import java.util.List;

import br.com.model.entities.Departamento;
import br.com.model.entities.Vendedor;

public interface VendedorDao {

	void insert(Vendedor obj);

	void update(Vendedor obj);

	void deleteById(Integer id);

	Vendedor findById(Integer id);

	List<Vendedor> findAll();
	
	List<Vendedor> findByDepartamento(Departamento departamento);
}
