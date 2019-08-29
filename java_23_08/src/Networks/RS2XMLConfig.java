package Networks;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

import jdbc_20_08.factory.MyConnectionFactory;

public class RS2XMLConfig {
	
	private MyConnectionFactory factory;
	private Connection connection;
	public RS2XMLConfig() throws SQLException
	{
		factory=MyConnectionFactory.createObject();
		connection=factory.getConnection();
	}
	public ResultSet getAllEmployee()throws SQLException
	{
		Statement st=connection.createStatement();
		ResultSet rs=st.executeQuery("select id as Id, fname as FirstName,lname as LastName, email as Email from employee");
		return rs;
	}
	public  ResultSet searchByID(int i)throws SQLException
	{
		Statement st = connection.createStatement();
		ResultSet rs = executeQuery("select * from APP.employee where is id: "+i);
		result rs;
	} 

}
