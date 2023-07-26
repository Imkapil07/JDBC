package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

//Insert data values into tables
public class jdbc2 {

	public static void main(String[] args) throws Exception{
		String url = "jdbc:mysql://localhost:3306/practice"; 
		String userName = "root";
		String password = "7489";   
		
		//Step 1 : Loading the driver 
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		//Step 3 : Establish the Connection.
		Connection conn = DriverManager.getConnection(url,userName,password); 
		//step 4 : Create a Statement object.
		Statement stm = conn.createStatement();
		//step 5 : Execute a query.
		String query="insert into studentt values (01,'Kapil','kprai@gmail')"; 
		stm.execute(query); 
		System.out.println("Data values inserted :");
		// Step 6 : close the connection
		conn.close();		

	}

}
