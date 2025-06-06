package com;

public class Test {
	
public static void main(String[] args) {
		
		Driver[] driver = new Driver[3];
		
		driver[0] = new Driver(1001,"Ravi","Car",1245);
		driver[1] = new Driver(1002,"Mahi","Lorry",3478);
		driver[2] = new Driver(1003,"Hanu","Auto",2738);
		
		Travel travel = new Travel();
		System.out.println("Is Car Driver : " + travel.isCarDriver(driver[0]));
		System.out.println(travel.retrivebyDriverId(driver, 1001));
		System.out.println("Count of Car Drivers : " + travel.retriveCountOfDriver(driver, "Car"));
		
		
		Driver[] carDriver = travel.retriveDriver(driver, "Car");
		System.out.println("Availabe Car Drivers are : ");
		for(Driver drivers:carDriver) {
			System.out.println(drivers.getDriverName());
		}
		
		Driver maxDriver = travel.retriveMaximumDistanceTravelledDriver(driver);
		System.out.println("Driver who travelled Maximum Distance is : " + maxDriver.getDriverName());
	}

}
