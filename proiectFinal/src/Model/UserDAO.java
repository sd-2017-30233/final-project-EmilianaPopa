package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;



public class UserDAO {
	
		MySqlConnector connection= new MySqlConnector();
		PreparedStatement statement=null;
		ResultSet result=null;
		
		public String login(String email, String passwords)
	    {
	        Connection conn=connection.getInstance();
	        try{
	          String sql="select * from users u where u.username=? AND u.parola=?";
	          statement=conn.prepareStatement(sql);
	          statement.setString(1, email);
	          statement.setString(2, passwords);
	          result=statement.executeQuery();
	          while(result.next())
	          {
	              if(result.getString("tip").equals("Doctor")) return "Doctor";
	              if(result.getString("tip").equals("Patient")) return "Patient";
	              if(result.getString("tip").equals("Admin")) return "Admin";
	          }
	        }catch(Exception ex){
	            
	            return "Eroare";
	        }
	        return "Date gresite";
	    }
		
		public void insert(User u)
		{
			Connection conn = connection.getInstance();
			try{
			String queryStr = "Insert into users (id_user,username,parola,tip) values (?,?,?,?)";
	        statement =conn.prepareStatement(queryStr);
	        statement.setInt(1, u.getId_user());
	        statement.setString(2, u.getUsername());
	        statement.setString(3, u.getPassword());
	        statement.setString(4, u.getTip());
	        statement.executeUpdate();
				
			}catch (Exception sqlException)
			{
				System.out.print("Eroare adauga user.");
			}
		}
		
		public void update(int id, User u)
		{
			Connection conn= connection.getInstance();
			try{
				String queryStr = "UPDATE users SET username=?, parola=?, tip=? where id_user=? ";
				statement =conn.prepareStatement(queryStr);
				statement.setString(1, u.getUsername());
				statement.setString(2, u.getPassword());
				statement.setString(3, u.getTip());
				statement.setInt(4, id);
				statement.executeUpdate();
			}catch(Exception sqlException)
			{
				System.out.print("Eroare update user.");
			}
		}
		
		public void delete(int id)
		{
			Connection conn= connection.getInstance();
			try{
				String queryStr = "DELETE FROM users where users.id_user=?";
				statement =conn.prepareStatement(queryStr);
				statement.setInt(1, id);
				statement.executeUpdate();
			}catch(Exception e)
			{
				System.out.print("Eroare delete user.");
			}
		}
		
		public ArrayList<User> listUsers()
		{
			Connection conn= connection.getInstance();
			try{
				ArrayList<User> list = new ArrayList<User>();
				String queryStr = "Select * from users";
				statement =conn.prepareStatement(queryStr);
				result = statement.executeQuery();
				while(result.next())
				{
					User u = new User(result.getInt("id_user"),result.getString("username"),result.getString("parola"),result.getString("tip"));
					list.add(u);
				}
				return list;
			}catch(Exception e)
			{
				System.out.print("Eroare listUsers.");
				return null;
			}
		}
	}


