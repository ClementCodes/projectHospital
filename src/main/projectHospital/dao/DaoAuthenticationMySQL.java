package projet1.projectHospital.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import projet1.projectHospital.model.Authentication;

public class DaoAuthenticationMySQL implements Dao<Authentication, String>{

	public List<Authentication> findAll() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public Authentication findByLogin(String login) throws ClassNotFoundException, SQLException {
		Authentication a = null;
		
		Connection conn = ConnectionMySQL.getInstance().getConn();
	
		ResultSet rs = ConnectionMySQL.getInstance().prepareSelectByLogin(login).executeQuery();
		if(rs.next())
		{
			a = new Authentication(rs.getString("login"),rs.getString("password"), rs.getString("name"), rs.getInt("job"));
		}
		conn.close();
		return a;
	}

	public void create(Authentication obj) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

	public void update(Authentication obj) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

	public void delete(Authentication obj) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

	public Authentication findById(String id) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
