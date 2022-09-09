package br.com.model.dao.implementacao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import br.com.db.DB;
import br.com.db.DbException;
import br.com.model.dao.DepartamentoDao;
import br.com.model.entities.Departamento;

public class DepartamentoDaoJDBC implements DepartamentoDao{

	private Connection con;
	
	public DepartamentoDaoJDBC(Connection con) {
		this.con = con;
	}
	
	@Override
	public void insert(Departamento obj) {

		PreparedStatement pst = null;
		try {
			pst = con.prepareStatement(
					"INSERT INTO department "
				  + "(Name) "
			      + "VALUES "
				  + "(?)", Statement.RETURN_GENERATED_KEYS);
			pst.setString(1, obj.getNome());
			
			int rowsAffected = pst.executeUpdate();
			
			if (rowsAffected > 0) {
				ResultSet rs = pst.getGeneratedKeys();
				if (rs.next()) {
					int id = rs.getInt(1);
					obj.setId(id);
				}
				DB.closeResultSet(rs);
			} else {
				throw new DbException("Erro inesperado nenhuma linha afetada!");
			}
		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		}finally {
			DB.closeStatement(pst);
		}
	}

	@Override
	public void update(Departamento obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Departamento findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Departamento> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
