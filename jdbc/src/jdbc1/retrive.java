package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class retrive {
	public static void main(String args[])
	{
		
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the id");
			int id=sc.nextInt();
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","roshni","stefan");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select*from sam_table1 where userid =" +id+" ");
		
			while(rs.next())
			System.out.println(rs.getInt(1)+ " " +rs.getString(2));
			
}catch(Exception e)
		{
	System.out.println(e);
		}
	}
}


