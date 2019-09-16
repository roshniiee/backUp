/*package dao;

import java.util.HashMap;

import bean.Vehicle;
//import ui.VehicleView;

interface VehicleDAO{
	public void addVehicle(Vehicle vehicle);
	public Vehicle getVehicleDetails(int id);	
}

public class VehicleDAOImpl implements VehicleDAO {


	HashMap<Integer,Vehicle> hash = new HashMap<Integer,Vehicle>();

	@Override
	public void addVehicle(Vehicle vehicle) {
		
		
		hash.put(vehicle.getVehicleId(),vehicle);
		System.out.println("addVehicleDAO"+hash);
	System.out.println("ADDED");
		
		
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public Vehicle getVehicleDetails(int id) {
		System.out.println("getVehicleDAO"+hash);
		
		Vehicle v=hash.get(id);
		System.out.println(v);
		//System.out.println(id);
		return v;
	}

}
*/