package projet1.projectHospital.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import projet1.projectHospital.model.Patients;

public class ConnectionMySQL {
	
	private Connection conn;
	private static ConnectionMySQL instance;
	
	
	
	public ConnectionMySQL() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver"); 
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hopital-cgi", "root", "root");
	}
	
	public static ConnectionMySQL getInstance() throws ClassNotFoundException, SQLException {
		if(instance == null)
			instance = new ConnectionMySQL();
		return instance;
	}
	
	
	public Connection getConn() {
		return conn;
	}

	public void close() throws SQLException{
		if(conn != null) conn.close();
		conn =null;
	}
	
	
	
	//Patients
	public PreparedStatement preparePatientsSelectAll() throws SQLException{
		String sql ="select * from patients";
		return conn.prepareStatement(sql);
	}
	public PreparedStatement preparePatientsSelectById(int id) throws SQLException{
		String sql ="select * from patients where id="+id;
		return conn.prepareStatement(sql);
	}
	public PreparedStatement preparePatientsCreate() throws SQLException{
		String sql ="insert into patients values(?,?,?,?,?,?)";
		return conn.prepareStatement(sql);
	}
	public PreparedStatement preparePatientsDelete(Patients obj) throws SQLException{
		String sql = "delete from patients where id="+obj.getId();
		return conn.prepareStatement(sql);
	}
	public PreparedStatement preparePatientsUpdate() throws SQLException{
		String sql = "update patients set lname=?, fname=?, age=?, adress=?, phone=? where id=?";
		return conn.prepareStatement(sql);
	}

	
	//Visits
	public PreparedStatement prepareVisitsSelectAll() throws SQLException{
		String sql ="select * from visits";
		return conn.prepareStatement(sql);
	}
	public PreparedStatement prepareVisitsSelectById(int idpatient) throws SQLException{
		String sql ="select * from visits where idpatient="+idpatient;
		return conn.prepareStatement(sql);
	}
	public PreparedStatement prepareVisitsCreate() throws SQLException{
		String sql="INSERT INTO visits (idpatient,date,doctor,roomnumber,price) VALUES (?,?,?,?,?)";
		return conn.prepareStatement(sql);
	}
	
	//Authentication
	public PreparedStatement prepareSelectByLogin(String login) throws SQLException{
		String sql ="select * from authentications where login="+"'"+login+"'";
		return conn.prepareStatement(sql);
	}

}
