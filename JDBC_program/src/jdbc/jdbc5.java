package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class jdbc5 {

	public static void main(String[] args) throws Exception{
		String url = "jdbc:mysql://localhost:3306/jdbcprac"; 
		String userName = "root";
		String password = "7489";   
		
		
		Class.forName("com.mysql.cj.jdbc.Driver"); 
	
		Connection conn = DriverManager.getConnection(url,userName,password); 
		String query="UPDATE data set id = ? where name = ?"; 
		PreparedStatement pstm = conn.prepareStatement(query);	
		pstm.setInt(1,1);
		pstm.setString(2,"timmy");		
		pstm.execute(); //USe executeUpdate. for update values
		System.out.println("Data updated successfully :");
		
		conn.close();	
	}

}
