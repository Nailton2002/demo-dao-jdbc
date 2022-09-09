package br.com.application;

import java.util.Scanner;

import br.com.model.dao.DaoFactory;
import br.com.model.dao.DepartamentoDao;
import br.com.model.entities.Departamento;


public class ProgramaVendedor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		DepartamentoDao departamentoDao = DaoFactory.createdepartamentoDao();
		
		System.out.println("\n======= Teste 1: Inserindo departamento ========");
		Departamento novoDepartamento = new Departamento(null, "Tecnologia");
		departamentoDao.insert(novoDepartamento);
		System.out.println("Inserindo, novo id = " + novoDepartamento.getId());
	}

}
