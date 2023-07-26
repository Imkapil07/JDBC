package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class jdbc7 {

	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/jdbcprac"; 
		String userName = "root";
		String password = "7489";   
		
		
		Class.forName("com.mysql.cj.jdbc.Driver"); 
	
		Connection conn = DriverManager.getConnection(url,userName,password); 
		String query="delete from data where id = 3"; 
		PreparedStatement pstm = conn.prepareStatement(query);		
		pstm.execute(); //USe executeUpdate. for update values
		System.out.println("Data Delete successfully :");
		
		conn.close();	
	}

}
