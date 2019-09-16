package dao;
import java.sql.*;
import java.util.Scanner;

import bean.Vehicle;
import service.VehicleService;
public class oracledao {
	Scanner sc=new Scanner(System.in);
	
	public void addVehicle(Vehicle vehicle) {
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","roshni","stefan");
			PreparedStatement stmt=con.prepareStatement("insert into vehicle values(?,?,?)");
			stmt.setInt(1,vehicle.getVehicleId());
                          stmt.setString(2,vehicle.getModelName());
                          stmt.setDouble(3, vehicle.getPrice());
                        //=  stmt.setC(4,vehicle.getType());
                          
                             stmt.executeUpdate();
              System.out.println("inserted");
                con.close();
              //  sc.close();
}
		catch(Exception e)
{
System.out.println(e);
}
	}
		
	public void getVehicleDetails(String name) 
	{
		//Vehicle v=new Vehicle();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","roshni","stefan");
			
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select*from vehicle where modelname ='" +name+"'");
	
			while(rs.next())
				System.out.println(rs.getInt(1)+ " " +rs.getString(2)+" "+rs.getDouble(3));//+" "+rs.getString(4));
			
}catch(Exception e)
		{
	System.out.println(e);
		}
	
		
		
	}
	
	}


