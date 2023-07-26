package jdbc;

import java.sql.*;
import java.util.Scanner;
public class jdbcprac {

	public static void main(String[] args) throws Exception{
		
		String url="jdbc:mysql://localhost:3306/jdbcprac";
		String userName="root";
		String password="7489"; 
		
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		Connection con = DriverManager.getConnection(url,userName,password);
        Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter table name: ");
		String tablename = sc.next();
		
		System.out.print("Enter roll Number: ");
		int id = sc.nextInt();
		
		System.out.print("Enter name: ");
		String name= sc.next(); 
		
		String query = "insert into "+tablename+" values(?,?)";
		PreparedStatement pstm = con.prepareStatement(query);
		pstm.setInt(1,id);
		pstm.setString(2,name);
		
		pstm.executeUpdate();
		con.close();

	}

}
