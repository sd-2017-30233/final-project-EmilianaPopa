package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DiagnosisDAO {
	MySqlConnector connection= new MySqlConnector();
	PreparedStatement statement=null;
	ResultSet result=null;
	public ArrayList<String> listDiagnosis(String s)
	{
		Connection conn= connection.getInstance();
		try{
			ArrayList<String> list=new ArrayList<String> ();
			String queryStr = "Select * from diagnosis where simptom=?";
			statement =conn.prepareStatement(queryStr);
			statement.setString(1, s);
			result = statement.executeQuery();
			while(result.next())
			{
				list.add(result.getString("boli"));
			
			}
			return list;
		}catch(Exception e)
		{
			System.out.print("Eroare listDiagnosis.");
			return null;
		}
	}
}
