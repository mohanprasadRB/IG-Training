package com.java.oops.Inheritance;
class car
{
	
	String carName;
	int	carId;
	/**
	 * @param carName
	 * @param carId
	 */
	public car(String carName, int carId) {
		super();
		this.carName = carName;
		this.carId = carId;
	}
}

class Driver extends car
{
	String driverName;
	Driver(String carname, int id, String drivername) {
		super(carname,id);
		this.driverName = drivername;
	}
	
}
public class Association {
	
public static void main(String[] args) {
	
	Driver dobj = new Driver("Ford", 101, "MOHAN");
	System.out.println(dobj.driverName +" is the driver of the car "+dobj.carName);

}	 

}
