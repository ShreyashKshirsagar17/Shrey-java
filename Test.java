package work1;
import java.util.*; 	

public class Test {
	
	static HashSet<Vehicle> vehicles = new HashSet<>();
	static Scanner sc=new Scanner(System.in);
	

	public static void main (String []args)
	
	{
		int choice;
		
		do {
			System.out.println("1. Add new Vehicle"
					+ " 2. Remove vehicle using vehicleId"
					+ " 3. Update vehicle price "
					+ "4. Sell vehicle "
					+ "5. Purchase vehicle "
					+ "6. Display all vehicles "
					+ "7. Display vehicles by type "
					+ "8. Display vehicles within price range "
					+ "9. Sort vehicles by price "
					+ "10. Search vehicle by name "
					+ "11. Exit ");
			
			choice=sc.nextInt();
			
			switch(choice)
			{
				case 1: addVehicle(); break;
	            case 2: removeVehicle(); break;
	            case 3: updatePrice(); break;
	            case 4: sellVehicle(); break;
	            case 5: purchaseVehicle(); break;
	            case 6: displayAll(); break;
	            case 7: displayByType(); break;
	            case 8: displayByPriceRange(); break;
	            case 9: sortByPrice(); break;
	            case 10: searchByName(); break;
			   
			}
		}while(choice != 11);
		
	}
	
	static void addVehicle()
	
	{
		int id;
		String name;
		double price;
		
		System.out.println("1. electricVehicle , 2. PetrolVehicle");
		int type=sc.nextInt();
		
		System.out.print("Enter the id name and price :");
		id=sc.nextInt();
		name =sc.next();
		price=sc.nextDouble();
		
		if(type==1)
		{
				System.out.println("Battery and Charging time :");
				int b=sc.nextInt();
				int c=sc.nextInt();
				

//	            vehicles.add(new ElectricVehicle(id, name, price, "Available", b, c));
		}
		if(type==2)
		{
			System.out.println("FuelType & Mileage:");
			int fule =sc.nextInt();
			int mil=sc.nextInt();
			
			vehicles.add(new PetrolVehicle(id, name, price, "Available", fuel, m));
			
		}
		
	}
	
	static void removeVehicle()
	{
		System.out.println("Enter id:");
		int id =sc.nextInt();	
		vehicles.removeIf(v -> v.getVehicleId() == id);
	}
	
	static void updateprice()
	{
		System.out.println("Enter id:");
		int id =sc.nextInt();
		
		for (Vehicle v : vehicles) {
            if (v.getVehicleId() == id) {
                System.out.print("New Price: ");
                v.setPrice(sc.nextDouble());
            }
        }
	static void sellVechile() 
	{
		System.out.println("enter the id :");
		int id =sc.nextInt();
		
		 for (Vehicle v : vehicles) {
	            if (v.getVehicleId() == id) {
	                v.setStatus("Sold");
	            }
	        }
	}
	
	static void purchesVehicle()
	{
		System.out.println("Enter the id:");
		int id =sc.nextInt();
		 for (Vehicle v : vehicles) {
	            if (v.getVehicleId() == id) {
	                v.setStatus("Available");
	            }
		
	}
	
	static void displayAll() {
		for (Vehicle v : vehicles) {
            v.display();
        }
		
	}
 
	static void displayByType()
	{
		 System.out.println("1.Electric 2.Petrol");
	        int type = sc.nextInt();

	        for (Vehicle v : vehicles) {
	            if (type == 1 && v instanceof ElectricVehicle) {
	                v.display();
	            } else if (type == 2 && v instanceof PetrolVehicle) {
	                v.display();
	            }
	        }
	}
	
	 static void displayByPriceRange() {
	        System.out.print("Enter min & max: ");
	        double min = sc.nextDouble();
	        double max = sc.nextDouble();

	        for (Vehicle v : vehicles) {
	            if (v.getPrice() >= min && v.getPrice() <= max) {
	                v.display();
	            }
	        }
	    }
	 static void sortByprice()
	 {
		 List<Vehicle> list = new ArrayList<>(vehicles);

	        list.sort(Comparator.comparingDouble(Vehicle::getPrice));

	        for (Vehicle v : list) {
	            v.display();
	        }
	 }
	 
	 static void searchByName() {
	        System.out.print("Enter name: ");
	        String name = sc.next();

	        for (Vehicle v : vehicles) {
	            if (v.getVehicleName().equalsIgnoreCase(name)) {
	                v.display();
	            }
	        }
	    }
}
