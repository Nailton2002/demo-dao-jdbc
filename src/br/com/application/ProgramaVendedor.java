package br.com.application;

import java.util.List;
import java.util.Scanner;

import br.com.model.dao.DaoFactory;
import br.com.model.dao.DepartamentoDao;
import br.com.model.entities.Departamento;


public class ProgramaVendedor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		DepartamentoDao departamentoDao = DaoFactory.createdepartamentoDao();
		
		System.out.println("======= TESTE 1: Inserindo departamento ========");
		Departamento novoDepartamento = new Departamento(null, "Tecnologia");
		departamentoDao.insert(novoDepartamento);
		System.out.println("Inserindo, novo id = " + novoDepartamento.getId());
		
		System.out.println("\n=== TESTE 2: findAll =======");
		List<Departamento> list = departamentoDao.findAll();
		for (Departamento dep : list) {
			System.out.println(dep);
		}
	}
}
