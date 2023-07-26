package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.*;

public class jdbc4 {

	public static void main(String[] args) throws Exception{
		String url = "jdbc:mysql://localhost:3306/jdbcprac"; 
		String userName = "root";
		String password = "7489";   
		
		
		Class.forName("com.mysql.cj.jdbc.Driver"); 
	
		Connection conn = DriverManager.getConnection(url,userName,password); 
		String query="select * from data"; 
		Statement stm = conn.createStatement();	
		ResultSet rs= stm.executeQuery(query); 
		while(rs.next()) {
			System.out.println(" | id ="+ rs.getInt(1)+ " | " + rs.getString(2) + " | "); 
			//System.out.println("id ="+ rs.getString(2));
		}
		System.out.println("READ SUCCESSFULLY ::");
		conn.close();	

	}

}
