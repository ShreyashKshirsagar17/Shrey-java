package work1;

public abstract class Vehicle {
	
	int vehicleId; 
	String vehicleName;
	Double price;
	String status;
	
	public Vehicle(int vehicleId,String vehicleName,Double price,String status)
	{
		this.price =price;
		this.status=status;
		this.vehicleId=vehicleId;
		this.vehicleName=vehicleName;
	}
	
	public int getvehicleId()
	{
		return vehicleId;
	}
	
	public String getvehicleName()
	{
		return  vehicleName;
	}
	
	public Double getprice()
	{
		return price;
		
	}
	public void setprice(double price)
	{
		this.price=price;
	}
	
	public void status(String status )
	{
		this.status=status;
	}
	
	public abstract void display();
	@Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Vehicle)) return false;
        Vehicle v = (Vehicle) obj;
        return this.vehicleId == v.vehicleId;
    }

    @Override
    public int hashCode() {
        return vehicleId;
    }

}
