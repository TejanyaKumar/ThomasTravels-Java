package com;

public class Travel {
	
	public boolean isCarDriver(Driver driver) {
		if(driver.getCategory().equalsIgnoreCase("car")) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String retrivebyDriverId(Driver[] driver, int driverId) {
		for(Driver drivers:driver) {
			if(drivers.getDriverId() == driverId) {
				return "Driver name is " + drivers.getDriverName() + " Belonging to the category " + drivers.getCategory() + " travelled " + drivers.getTotalDistance() + " KMs"; 
			}
		  }
		      return "Driver not found!";
		}
	
	public int retriveCountOfDriver(Driver[] driver, String category) {
		
		 int count = 0;
		    for (Driver d : driver) {
		        if (d.getCategory().equalsIgnoreCase(category)) {
		            count++;
		        }
		    }
		    return count;
		
	}
	
	public Driver retriveMaximumDistanceTravelledDriver(Driver[] driver ) {
		if(driver.length == 0) return null;
		Driver maxDriver=driver[0];
		for(Driver drivers:driver) {
			if(drivers.getTotalDistance()>maxDriver.getTotalDistance()) {
				maxDriver=drivers;
			}
		}
		
		return maxDriver;
	}
	
	public Driver[] retriveDriver(Driver[] drivers, String category) {
	    int count = 0;
	    for (Driver d : drivers) {
	        if (d.getCategory().equalsIgnoreCase(category)) {
	            count++;
	        }
	    }

	    Driver[] result = new Driver[count];
	    int index = 0;
	    for (Driver d : drivers) {
	        if (d.getCategory().equalsIgnoreCase(category)) {
	            result[index++] = d;
	        }
	    }

	    return result;
	}

	}

