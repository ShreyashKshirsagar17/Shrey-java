package work1;

public  class ElectricVehicle extends Vehicle{
	
	int batteryCapacity;
    int chargingTime;

	public ElectricVehicle(int vehicleId, String vehicleName, Double price, String status, int batteryCapacity, int chargingTime) {
		super(vehicleId, vehicleName, price, status);
		
		this.batteryCapacity=batteryCapacity;
		this.chargingTime=chargingTime;
	}

	@Override
	public void display() {
		System.out.println("Electric vehicle :"+ vehicleId +" "+ vehicleName +" "+ "Price is "+ price +" Status "+status+
				"batteryCapacity is "+batteryCapacity +"chargingTime is "+chargingTime);
		 
	}

}
