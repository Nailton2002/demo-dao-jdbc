package br.com.model.dao;

import br.com.model.dao.implementacao.VendedorDaoJBDBC;

public class DaoFactory {

	public static VendedorDao createVendedorDao() {
		return new VendedorDaoJBDBC();
		
	}
}
