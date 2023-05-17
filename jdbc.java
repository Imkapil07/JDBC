package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class jdbc {

	public static void main(String[] args) throws Exception{ 
		
//		5 Steps :
//			Driver load.
//			connection establish.
//			statement create.
//			execute - query.
//			connection close.  
		
//		for User name : in mqsql cmmnd line : select user();
//		for local host number : 3306 : select @@port;
		
		//Step 2 Define the connection URL.
		String url = "jdbc:mysql://localhost:3306/"; 
		String userName = "root";
		String password = "7489";   
		
		//Step 1 : Loading the driver 
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		//Step 3 : Establish the Connection.
		Connection conn = DriverManager.getConnection(url,userName,password); 
		//step 4 : Create a Statement object.
		Statement stm = conn.createStatement();
		//step 5 : Execute a query.
		String query="create database army"; 
	     stm.execute(query);
		// Step 6 : close the connection
		conn.close();
		System.out.println("Success:");
			
	}

}
