package testJDBC;

import java.sql.*;

public class UpdateData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/mydatabase";
		String username="root";
		String password="Sumana@90140";
		String query="UPDATE employees\n"+
		"SET job_title='Full Stack Developer',salary=70000.00\n"+
		"WHERE id=2;";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Drivers loaded successfully!!!");
		}catch(ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			Connection con=DriverManager.getConnection(url,username,password);
			System.out.println("Connection Established Successfully !!");
			Statement stmt=con.createStatement();
			
			int rowsaffected=stmt.executeUpdate(query);//we will get how many rows affected with this int
			if(rowsaffected>0) {
				System.out.println("UPDATE Successful."+rowsaffected+" rows(s) affected");
			}
			else {
				System.out.println("UPDATE failed!!");
			}
			
			stmt.close();
			con.close();
			System.out.println("Connection closed successfully !!");
		}
		catch(SQLException e){
			System.out.println(e.getMessage());
		}


	}

}
