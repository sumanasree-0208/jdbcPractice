package testJDBC;
//firstly we have to import this for all lib o work with jdbc
import java.sql.*;

public class AccessingEmployeeTableThroughJDBC {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/mydatabase";
		String username="root";
		String password="Sumana@90140";
		String query="select * from employees;";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Drivers loaded successfully!!!");
		}catch(ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		try {
//			in this we will connect the database to the drivers using Connection
			Connection con=DriverManager.getConnection(url,username,password);
			System.out.println("Connection Established Successfully !!");
//			after the connection we will create a statement to run the sql queries
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(query);//every line is using the previous interface ka reference to execute
			while(rs.next()) {
				int id=rs.getInt("id");//right side names are the fields name of mysql 
				String name=rs.getString("name");//left side one is the name that we declared in this program
				String job_title=rs.getString("job_title");
				double salary=rs.getDouble("salary");
				System.out.println("========================");
				System.out.println("ID : "+id);
				System.out.println("Name : "+name);
				System.out.println("Job Title : "+job_title);
				System.out.println("Salary : "+salary);
			}
			rs.close();
			stmt.close();
			con.close();
			System.out.println("Connection closed successfully !!");
		}
		catch(SQLException e){
			System.out.println(e.getMessage());
		}

	}

}
