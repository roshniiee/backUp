package jdbc1;
import java.sql.*;
import java.util.Scanner;

public class preparedstmt {
	public static void main(String args[])
	{
		
		try {
		
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","roshni","stefan");
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the user name");
			String name=sc.next();
			System.out.println("enter the id");
			int id=sc.nextInt();
			PreparedStatement stmt=con.prepareStatement("insert into sam values(?,?)");
						stmt.setInt(1,id);
			stmt.setString(2,name);
			stmt.executeUpdate();
			System.out.println("inserted");
			con.close();
			sc.close();
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
