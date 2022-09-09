package br.com.model.dao;

import java.util.List;

import br.com.model.entities.Departamento;

public interface DepartamentoDao {

	void insert(Departamento obj);

	void update(Departamento obj);

	void deleteById(Departamento id);

	Departamento findById(Integer id);

	List<Departamento> findAll();
}
