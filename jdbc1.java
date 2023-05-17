package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

//Creat table :
public class jdbc1 {

	public static void main(String[] args) throws Exception {
		//Step 2 Define the connection URL.
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
				String query="create table studentt(sid int(3), sname varchar(100), semail varchar(100))"; 
				stm.execute(query); 
				System.out.println("Table Created :");
				// Step 6 : close the connection
				conn.close();
				
	}

}
