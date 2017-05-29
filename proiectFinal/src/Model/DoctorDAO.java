package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class DoctorDAO {
		MySqlConnector connection= new MySqlConnector();
		PreparedStatement statement=null;
		ResultSet result=null;
		
		
		
		public void insert(Doctor d)
		{
			Connection conn = connection.getInstance();
			try{
			String queryStr = "Insert into doctors (id_doc,nume,address,specializare) values (?,?,?,?)";
	        statement =conn.prepareStatement(queryStr);
	        statement.setInt(1, d.getId_doc());
	        statement.setString(2, d.getNume());
	        statement.setString(3, d.getAddress());
	        statement.setString(4, d.getSpecializare());
	        statement.executeUpdate();
	        
	        /*String queryStr1 = "Insert into users (id_user,username,parola,tip) values (?,?,?,?)";
	        statement =conn.prepareStatement(queryStr1);
	        statement.setInt(1, u.getId_user());
	        statement.setString(2, u.getUsername());
	        statement.setString(3, u.getPassword());
	        statement.setString(4, u.getTip());
	        statement.executeUpdate();*/
				
			}catch (Exception sqlException)
			{
				System.out.print("Eroare adauga doctor.");
			}
		}
		
		public void update(int id, Doctor d)
		{
			Connection conn= connection.getInstance();
			try{
				String queryStr = "UPDATE users SET nume=?, address=?, specializare=? where id_doc=? ";
				statement =conn.prepareStatement(queryStr);
				statement.setString(1, d.getNume());
				statement.setString(2, d.getAddress());
				statement.setString(3, d.getSpecializare());
				statement.setInt(4, id);
				statement.executeUpdate();
			}catch(Exception sqlException)
			{
				System.out.print("Eroare update doctor.");
			}
		}
		
		public void delete(int id_doctor, int id_user)
		{
			Connection conn= connection.getInstance();
			try{
				String queryStr1 = "DELETE FROM doctors where doctors.id_doc=?";
				statement =conn.prepareStatement(queryStr1);
				statement.setInt(1, id_doctor);
				statement.executeUpdate();
				
				String queryStr = "DELETE FROM users where users.id_user=?";
				statement =conn.prepareStatement(queryStr);
				statement.setInt(1, id_user);
				statement.executeUpdate();
				
				
			}catch(Exception e)
			{
				System.out.print("Eroare delete doctor.");
			}
		}
		
		public ArrayList<Doctor> listDoctors()
		{
			Connection conn= connection.getInstance();
			try{
				ArrayList<Doctor> list = new ArrayList<Doctor>();
				String queryStr = "Select * from doctors";
				statement =conn.prepareStatement(queryStr);
				result = statement.executeQuery();
				while(result.next())
				{
					Doctor d = new Doctor(result.getInt("id_doc"),result.getString("nume"),result.getString("address"),result.getString("specializare"));
					list.add(d);
				}
				return list;
			}catch(Exception e)
			{
				System.out.print("Eroare listDoctors.");
				return null;
			}
		}
	}


