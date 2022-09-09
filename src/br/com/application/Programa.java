package br.com.application;

import br.com.model.dao.DaoFactory;
import br.com.model.dao.VendedorDao;
import br.com.model.entities.Vendedor;

public class Programa {

	public static void main(String[] args) {
		
		VendedorDao vendedorDao = DaoFactory.createVendedorDao();
		
		Vendedor vend = vendedorDao.findById(3);
		
		System.out.println(vend);

	}

}
