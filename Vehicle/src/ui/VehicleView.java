package ui;

import java.util.Random;
import java.util.Scanner;

import bean.Vehicle;
import bean.Vehicle.CarType;
import service.VehicleService;
//import bean.Vehicle.CarType;
public class VehicleView {
	Scanner sc=new Scanner(System.in);
	Vehicle v;
	Random randomobj=new Random();
	VehicleService serviceobj=new VehicleService();
	

	public VehicleView() {
		// TODO Auto-generated constructor stub
	}

	public void addVehicleDetails() 
	{
		System.out.println("enter the details:");
		System.out.println("modelName = ");
		String modelname=sc.next();
		System.out.println("modelName = "+modelname);
		System.out.println("Price = ");
		double price=pricecheck(sc.nextInt());
		System.out.println("Price = "+price);
		
		System.out.println("CarType = ");
		String type = sc.next();
		 System.out.println("CarType = "+type);
		 CarType ct=CarType.valueOf(type);
		
		System.out.println("details added Successfully!");
		
		int vehicleid=randomobj.nextInt(100);
		System.out.println("vehicle id "+vehicleid);
		
		v=new Vehicle(vehicleid,modelname,price,ct);
		
	System.out.println("Vehicle view"+v);
       serviceobj.addVehicleDetails(v);
       
     

	}

	
	public int pricecheck(int price) {
		try {
			if(price<500000)
			{
				System.out.println("PriceException");
				System.exit(0);
			}
			
		}catch(Exception e){
			System.out.println(e);
		}
		return price;
	}

public void getVehicleDetails() {
	System.out.println("Enter a vehicle name:");
	//int vId=sc.nextInt();
	String name=sc.next();
	serviceobj.getVehicleDetails(name);
	
}

}
