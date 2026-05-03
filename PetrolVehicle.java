package work1;

public class PetrolVehicle extends Vehicle {
	
	String fuelType;
	double mileage;

	public PetrolVehicle(int vehicleId, String vehicleName, Double price, String status, String fuelType, double mileage) {
		super(vehicleId, vehicleName, price, status);
		
		this.fuelType=fuelType;
		this.mileage=mileage;
		
		
	}

	@Override
	public void display() {
		
		System.out.println("Petrol Vehicle :"+vehicleId+ " "+" vehicleName :"+vehicleName+ " Price is "+ price+"Status is " +status+
				"fuelType"+fuelType+"mileage is "+mileage);
		
	}

	
}
