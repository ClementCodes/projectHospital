package projet1.projectHospital.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import projet1.projectHospital.model.Visit;

public class DaoVisitsMySQL implements Dao<Visit, Integer>{

	public List<Visit> findAll() throws ClassNotFoundException, SQLException {
		ArrayList<Visit> liste = new ArrayList<Visit>();
		Connection conn = ConnectionMySQL.getInstance().getConn();
		ResultSet rs = ConnectionMySQL.getInstance().prepareVisitsSelectAll().executeQuery();
		Statement st=conn.createStatement();
		
		while(rs.next())
		{
			Visit v = new Visit();
			v.setId(rs.getInt("id"));
			v.setIdpatient(rs.getInt("idpatient"));
			v.setDate(rs.getString("date"));
			v.setDoctor(rs.getString("doctor"));
			v.setNumsalle(rs.getInt("roomnumber"));
			v.setPrice(rs.getInt("price"));
			
			liste.add(v);
		}
		return liste;
	}

	public Visit findById(Integer idpatient) throws ClassNotFoundException, SQLException {
		Visit v = null;
		Connection conn = ConnectionMySQL.getInstance().getConn();
		
		ResultSet rs = ConnectionMySQL.getInstance().prepareVisitsSelectById(idpatient).executeQuery();
		Statement st=conn.createStatement();
		if(rs.next())
		{
			v = new Visit(rs.getInt("id"),rs.getInt("idpatient"), rs.getString("date"), rs.getString("doctor"), rs.getInt("roomnumber"), rs.getInt("price"));
		}
		return v;
		
	}

	public void create(Visit obj) throws ClassNotFoundException, SQLException {
		Connection conn = ConnectionMySQL.getInstance().getConn();
		
		PreparedStatement ps= ConnectionMySQL.getInstance().prepareVisitsCreate();
		ps.setInt(1,obj.getIdpatient());
		ps.setString(2,obj.getDate());
		ps.setString(3, obj.getDoctor());
		ps.setInt(4, obj.getNumsalle());
		ps.setInt(5, obj.getPrice());
		ps.executeUpdate();
		
	}

	public void update(Visit obj) throws ClassNotFoundException, SQLException {
		
	}

	public void delete(Visit obj) throws ClassNotFoundException, SQLException {
		
	}

}
