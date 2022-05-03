package projet1.projectHospital.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import projet1.projectHospital.model.Patients;

	public class DaoPatientsMySQL implements Dao<Patients, Integer>{
	
	public List<Patients> findAll() throws ClassNotFoundException, SQLException {
		ArrayList<Patients> liste = new ArrayList<Patients>();
		Connection conn = ConnectionMySQL.getInstance().getConn();
		ResultSet rs = ConnectionMySQL.getInstance().preparePatientsSelectAll().executeQuery();
		Statement st=conn.createStatement();
		while(rs.next())
		{
			Patients p = new Patients();
			p.setId(rs.getInt("id"));
			p.setNom(rs.getString("lname"));
			p.setPrenom(rs.getString("fname"));
			p.setAge(rs.getInt("age"));
			p.setAdresse(rs.getString("adress"));
			p.setTelephone(rs.getString("phone"));
			
			liste.add(p);
		}
			
		return liste;
	}

	public Patients findById(Integer id) throws ClassNotFoundException, SQLException {
		Patients p = null;
		Connection conn = ConnectionMySQL.getInstance().getConn();
		ResultSet rs = ConnectionMySQL.getInstance().preparePatientsSelectById(id).executeQuery();
		Statement st=conn.createStatement();
		if(rs.next())
		{
			p = new Patients(rs.getInt("id"),rs.getString("lname"), rs.getString("fname"), rs.getInt("age"), rs.getString("adress"),rs.getString("phone"));
		}
		
		return p;
	}

	public void create(Patients obj) throws ClassNotFoundException, SQLException {
		Connection conn = ConnectionMySQL.getInstance().getConn();
		
		PreparedStatement ps= ConnectionMySQL.getInstance().preparePatientsCreate();
		ps.setInt(1,obj.getId());
		ps.setString(2,obj.getNom());
		ps.setString(3, obj.getPrenom());
		ps.setInt(4, obj.getAge());
		ps.setString(5, obj.getAdresse());
		ps.setString(6, obj.getTelephone());
		ps.executeUpdate();
		
	}

	public void update(Patients obj) throws ClassNotFoundException, SQLException {
		Connection conn = ConnectionMySQL.getInstance().getConn();

		PreparedStatement st = ConnectionMySQL.getInstance().preparePatientsUpdate();
		
		st.setString(1,obj.getNom());
		st.setString(2, obj.getPrenom());
		st.setInt(3, obj.getAge());
		st.setString(4, obj.getAdresse());
		st.setString(5, obj.getTelephone());
		st.setInt(6, obj.getId());
		st.executeUpdate();

		
		
	}

	public void delete(Patients obj) throws ClassNotFoundException, SQLException {
		Connection conn = ConnectionMySQL.getInstance().getConn();
		
		String sql = "delete from patients where id="+obj.getId();
		
		Statement st=conn.createStatement();
		st.executeUpdate(sql);
		
		
		
	}


}
