import java.util.*;

class Vehicle {
	/*protected  String make,vehicalnumber,fuelType;
	protected  int fuelCapacity,cc;*/
	
	Vehicle(String make,String vehicalnumber,String fuelType,int fuelCapacity,int cc){
		System.out.println("***"+make+"***"
				+ "\n---Basic Information---"
				+ "\nVehicle Number :"+ vehicalnumber 
				+ "\nFuel Capacity :" + fuelCapacity 
				+ "\nFuel Type :" + fuelType
				+ "\nCC: "+ cc);
	}
	
}

class TwoWheeler extends Vehicle{
	
	TwoWheeler(String make, String vehicalnumber, String fuelType, int fuelCapacity, int cc,String kickStartAvailable) {
		super(make, vehicalnumber, fuelType, fuelCapacity, cc);
		System.out.println("---Detail Information---\n"
				+ "Kick Start Available:"
				+ kickStartAvailable);
	}

}

class FourWheeler extends Vehicle{

	FourWheeler(String make, String vehicalnumber, String fuelType, int fuelCapacity, int cc,String audioSystem , int numberOfDoors) {
		super(make, vehicalnumber, fuelType, fuelCapacity, cc);
		System.out.println("---Detail Information---\n"
				+ "Audio System:" + audioSystem 
				+ "\nNumber of Doors:" + numberOfDoors);
		}
	}


public class vehicalmain {
    public static void main(String[] args) {
		System.out.println("1.Four Wheeler\n"
						+  "2.Two Wheeler\n"
						+  "Enter The Vehical Type");
		Scanner sc = new Scanner(System.in);
		int chooice = sc.nextInt();
        String make,vehicalnumber,fuelType,audioSystem;
		int fuelCapacity,cc,numberOfDoors;
		System.out.println("Vehicle Make:");
		make = sc.next();
		System.out.println("Vehicle Number:");
		vehicalnumber = sc.next();
		System.out.println("Fuel Type:\n1.Petrol\n2.Diesel");
        int fuelchooice = sc.nextInt();
        if(fuelchooice == 1)
		fuelType = "Petrol";
        else
        fuelType = "Diesel";
		System.out.println("Fuel Capacity:");
		fuelCapacity = sc.nextInt();
        System.out.println("Engine CC:");
		cc = sc.nextInt();
		switch(chooice) {
		  case 1:
			System.out.println("Audio System:");
			audioSystem = sc.next();
			System.out.println("Number of Doors:");
			numberOfDoors = sc.nextInt();
			
			//Object calling FourWheeler is a constructor
			FourWheeler fobj = new FourWheeler(make, vehicalnumber, fuelType, fuelCapacity,  
					cc , audioSystem, numberOfDoors);
		    break;
		  case 2:
          System.out.println("Kick Start Available(yes/no):");
          String kickStartAvailable = sc.next() ;

          TwoWheeler tobj = new TwoWheeler(make, vehicalnumber, fuelType, fuelCapacity,  
          cc ,kickStartAvailable);
		    // code block
		    break;
		}
		sc.close();
	}    
}
