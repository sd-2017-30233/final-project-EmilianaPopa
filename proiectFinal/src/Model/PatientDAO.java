package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class PatientDAO {
	MySqlConnector connection= new MySqlConnector();
	PreparedStatement statement=null;
	ResultSet result=null;
	
	
	public void insert(Patient p, User u)
	{
		Connection conn = connection.getInstance();
		try{
		String queryStr = "Insert into patients (CNP,nume,address,dateOfBirth) values (?,?,?,?)";
        statement =conn.prepareStatement(queryStr);
        statement.setString(1, p.getCNP());
        statement.setString(2, p.getNume());
        statement.setString(3, p.getAddress());
        statement.setString(4, p.getDateOfBirth());
        statement.executeUpdate();
        
        String queryStr1 = "Insert into users (id_user,username,parola,tip) values (?,?,?,?)";
        statement =conn.prepareStatement(queryStr1);
        statement.setInt(1, u.getId_user());
        statement.setString(2, u.getUsername());
        statement.setString(3, u.getPassword());
        statement.setString(4, u.getTip());
        statement.executeUpdate();
			
		}catch (Exception sqlException)
		{
			System.out.print("Eroare adauga pacient.");
		}
	}
	
	public void update(String cnp, Patient p)
	{
		Connection conn= connection.getInstance();
		try{
			String queryStr = "UPDATE patients SET nume=?, address=?, dateOfBirth=? where CNP=? ";
			statement =conn.prepareStatement(queryStr);
			statement.setString(1, p.getNume());
			statement.setString(2, p.getAddress());
			statement.setString(3, p.getDateOfBirth());
			statement.setString(4, cnp);
			statement.executeUpdate();
		}catch(Exception sqlException)
		{
			System.out.print("Eroare update patient.");
		}
	}
	
	public void delete(int id_user, String cnp)
	{
		Connection conn= connection.getInstance();
		try{
			String queryStr1 = "DELETE FROM patients where patients.CNP=?";
			statement =conn.prepareStatement(queryStr1);
			statement.setString(1, cnp);
			statement.executeUpdate();
			
			String queryStr = "DELETE FROM users where users.id_user=?";
			statement =conn.prepareStatement(queryStr);
			statement.setInt(1, id_user);
			statement.executeUpdate();
			
			
		}catch(Exception e)
		{
			System.out.print("Eroare delete patient.");
		}
	}
	
	public ArrayList<Patient> listPatients()
	{
		Connection conn= connection.getInstance();
		try{
			ArrayList<Patient> list = new ArrayList<Patient>();
			String queryStr = "Select * from patients";
			statement =conn.prepareStatement(queryStr);
			result = statement.executeQuery();
			while(result.next())
			{
				Patient p = new Patient(result.getString("CNP"),result.getString("nume"),result.getString("address"),result.getString("dateOfBirth"));
				list.add(p);
			}
			return list;
		}catch(Exception e)
		{
			System.out.print("Eroare listPatients.");
			return null;
		}
	}

}
