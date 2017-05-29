package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class AppointmentDAO {
	MySqlConnector connection= new MySqlConnector();
	PreparedStatement statement=null;
	ResultSet result=null;
	
	public void insert(Appointment a)
	{
		Connection conn = connection.getInstance();
		try{
		String queryStr = "Insert into consultations (consultNr,doctorName,patientName,dateC,details,state) values (?,?,?,?,?,?)";
        statement =conn.prepareStatement(queryStr);
        statement.setInt(1, a.getConsultNr());
        statement.setString(2, a.getDoctorName());
        statement.setString(3, a.getPatientName());
        statement.setString(4, a.getDateC());
        statement.setString(5, a.getDetails());
        statement.setString(6, a.getState());
        statement.executeUpdate();
			
		}catch (Exception sqlException)
		{
			System.out.print("Eroare adauga appointment.");
		}
	}
	
	public void update(int id, String status, int price)
	{
		Connection conn= connection.getInstance();
		try{
			String queryStr = "UPDATE consultations SET state=?, price=? where consultNr=? ";
			statement =conn.prepareStatement(queryStr);
			statement.setString(1, status);
			statement.setInt(2, price);
			statement.setInt(3, id);
			statement.executeUpdate();
		}catch(Exception sqlException)
		{
			System.out.print("Eroare update appointment.");
		}
	}
	
	
	
	public ArrayList<String> listAppointments(String s, String s2)
	{
		Connection conn= connection.getInstance();
		try{
			ArrayList<String> list = new ArrayList<String>();
			String queryStr = "Select * from consultations where state=? AND doctorName=?";
			statement =conn.prepareStatement(queryStr);
			 statement.setString(1, s);
			 statement.setString(2, s2);
			result = statement.executeQuery();
			while(result.next())
			{
				//Appointment a = new Appointment(result.getInt("consultNr"),result.getString("doctorName"),result.getString("patientName"),result.getString("dateC"), result.getString("details"),result.getString("state"));
				list.add(result.getInt("consultNr")+"    "+result.getString("doctorName")+"     "+result.getString("patientName")+"    "+result.getString("dateC")+"      "+ result.getString("details")+"      "+result.getString("state")+"       "+result.getInt("price"));
			}
			return list;
		}catch(Exception e)
		{
			System.out.print("Eroare listAppointments.");
			return null;
		}
	}
	
	public ArrayList<Appointment> getAppointment(int id)
	{
		Connection conn= connection.getInstance();
		try{
			ArrayList<Appointment> list = new ArrayList<Appointment>();
			String queryStr = "Select * from consultations where consultNr=?";
			statement =conn.prepareStatement(queryStr);
			 statement.setInt(1, id);
			result = statement.executeQuery();
			while(result.next())
			{
				Appointment a = new Appointment(result.getInt("consultNr"),result.getString("doctorName"),result.getString("patientName"),result.getString("dateC"), result.getString("details"),result.getString("state"));
				list.add(a);
			}
			return list;
		}catch(Exception e)
		{
			System.out.print("Eroare getAppointment.");
			return null;
		}
	}
	
	public boolean checkAvailability(String n, String d)
	{
		boolean ok=true;
		Connection conn= connection.getInstance();
		try{
			String queryStr = "Select * from consultations";
			statement =conn.prepareStatement(queryStr);
			result = statement.executeQuery();
			
			while(result.next())
			{
				if(result.getString("doctorName").equals(n) && result.getString("dateC").equals(d))
				{
					ok=false;
				
					break;
			}}
			
			return ok;
		}catch(Exception e)
		{
			e.printStackTrace();
			System.out.print("Eroare checkAvailable.");
			return false;
		}
	}
	
	public ArrayList<Appointment> listAppointment()
	{
		Connection conn= connection.getInstance();
		try{
			ArrayList<Appointment> list = new ArrayList<Appointment>();
			String queryStr = "Select * from consultations";
			statement =conn.prepareStatement(queryStr);
			result = statement.executeQuery();
			while(result.next())
			{
				Appointment p = new Appointment(result.getInt("consultNr"),result.getString("doctorName"),result.getString("patientName"),result.getString("dateC"),result.getString("details"),result.getString("state"),result.getInt("price"));
				list.add(p);
			}
			return list;
		}catch(Exception e)
		{
			System.out.print("Eroare listAppointment.");
			return null;
		}
	}
}
