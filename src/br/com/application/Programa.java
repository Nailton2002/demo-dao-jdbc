package br.com.application;

import java.util.Date;
import java.util.List;

import br.com.model.dao.DaoFactory;
import br.com.model.dao.VendedorDao;
import br.com.model.entities.Departamento;
import br.com.model.entities.Vendedor;

public class Programa {

	public static void main(String[] args) {

		VendedorDao vendedorDao = DaoFactory.createVendedorDao();
		System.out.println("======= Teste 1: Vendedor buscar todos por id ========");
		Vendedor vend = vendedorDao.findById(3);
		System.out.println(vend);

		System.out.println("\n======= Teste 2: Vendedor buscar por departamento ========");
		Departamento departamento = new Departamento(2, null);
		List<Vendedor> list = vendedorDao.findByDepartamento(departamento);
		for (Vendedor obj : list) {
			System.out.println(obj);
		}

		System.out.println("\n======= Teste 3: Listando todos os vendedores ========");
		list = vendedorDao.findAll();
		for (Vendedor obj : list) {
			System.out.println(obj);
		}
//
//		System.out.println("\n======= Teste 4: Inserindo vendedores ========");
//		Vendedor novoVendedor = new Vendedor(null, "Nailton", "nal@email.com", new Date(), 3000.0, departamento);
//		vendedorDao.insert(novoVendedor);
//		System.out.println("Inserindo, novo id = " + novoVendedor.getId());

		System.out.println("\n======= Teste 5: Atualizando vendedores ========");
		vend = vendedorDao.findById(1);
		vend.setNome("Mendes");
		vendedorDao.update(vend);
		System.out.println("Atualização do nome do vendedor!");
	}
}