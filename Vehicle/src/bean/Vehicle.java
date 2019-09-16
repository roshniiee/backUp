package bean;

//import service.VehicleView;

public class Vehicle {
	public static int vehicleId;
	public String modelName;
	public double price;
	CarType type;
	
	
	public Vehicle(int vehicleId) {
		this.vehicleId=vehicleId;
	}
public Vehicle(int vehicleId,String modelName,double price,CarType type) {
		this.vehicleId=vehicleId;
		this.modelName=modelName;
		this.price=price;
		this.type=type;
	}
public Vehicle(String modelName,double price,CarType type) {

	this.modelName=modelName;
	this.price=price;
	this.type=type;
}
public Vehicle(String modelname2, int price2) {
	// TODO Auto-generated constructor stub
}

	public Vehicle(String modelname2, int price2, String type2, int vehicleid2) {
		// TODO Auto-generated constructor stub
	}
	
	

	public Vehicle(String modelname2, double price2, String type2, int vehicleid2) {
		// TODO Auto-generated constructor stub
	}



	public Vehicle() {
		// TODO Auto-generated constructor stub
	}



	public Vehicle(String modelname2, double price2, String type2) {
		// TODO Auto-generated constructor stub
	}



	public enum CarType{
		HATCHBACK,SEDAN,MPV,SUV;
	}
		

	
	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public CarType getType() {
		return type;
	}
	public void setType(CarType type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Vehicle [modelName=" + modelName + ", price=" + price + ", type=" + type + "]";
	}
	
	
	
	

}


