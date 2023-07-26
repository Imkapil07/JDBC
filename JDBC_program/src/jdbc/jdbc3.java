package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class jdbc3 {

	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/practice"; 
		String userName = "root";
		String password = "7489";   
		
		
		Class.forName("com.mysql.cj.jdbc.Driver"); 
	
		Connection conn = DriverManager.getConnection(url,userName,password); 
		String query="insert into studentt values (?,?,?)"; 
		PreparedStatement pstm = conn.prepareStatement(query);	
		pstm.setInt(1,10);
		pstm.setString(2,"Sachin");
		pstm.setString(3,"sachin@gmail.com");
		
		pstm.execute(); //USe executeUpdate. for update values
		System.out.println("Data values inserted :");
		
		conn.close();	

	}

}
