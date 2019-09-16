package service;




import bean.Vehicle;
import dao.oracledao;
//import ui.VehicleView;

public class VehicleService {


	
	oracledao daoobj=new oracledao();
	public void addVehicleDetails(Vehicle v) {
		System.out.println("Vehicleservice"+v);
		
		daoobj.addVehicle(v);
	}
	public void getVehicleDetails(String name) {
		System.out.println(name);
		daoobj.getVehicleDetails(name);
	
	
		
	}

}
