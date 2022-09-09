package br.com.model.dao;

import br.com.db.DB;
import br.com.model.dao.implementacao.VendedorDaoJDBC;

public class DaoFactory {

	public static VendedorDao createVendedorDao() {
		return new VendedorDaoJDBC(DB.getConnection());

	}
}
