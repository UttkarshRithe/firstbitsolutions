
//• vehicleNumber
//• model
//• companyName
//• noOfWheels
//• price
class Vehicle
{
	int vehicaleNumber;
	String model;
	String companyName;
	int noOfWheels;
	double price;
	
	Vehicle()
	{
		this.vehicaleNumber=1;
		this.model="Zxi";
		this.companyName="Suzuki";
		this.noOfWheels=4;
		this.price=500000.0;
	}
	Vehicle(int vehicaleNumber, String model, String companyName, int noOfWheels, double price) {
		this.vehicaleNumber = vehicaleNumber;
		this.model = model;
		this.companyName = companyName;
		this.noOfWheels = noOfWheels;
		this.price = price;
	}
	int getVehicaleNumber() {
		return vehicaleNumber;
	}
	void setVehicaleNumber(int vehicaleNumber) {
		this.vehicaleNumber = vehicaleNumber;
	}
	String getModel() {
		return model;
	}
	void setModel(String model) {
		this.model = model;
	}
	String getCompanyName() {
		return companyName;
	}
	void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	int getNoOfWheels() {
		return noOfWheels;
	}
	void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}
	double getPrice() {
		return price;
	}
	void setPrice(double price) {
		this.price = price;
	}
	
	void display()
	{
		System.out.println("Vehical number:"+this.vehicaleNumber);
		System.out.println("model: "+this.model);
		System.out.println("companyName:"+this.companyName);
		System.out.println("noOfWheel:"+this.noOfWheels);
		System.out.println("Price:"+this.price);
	}
	
}


//Bike is-a Vehicle
//• noOfStands
//• noOfHelmets
//• bikeCategory
class Bike extends Vehicle
{
	
	int noOfStands;
	int noOfHelmets;
	String BikeCategory;
	
	Bike()
	{
		super();
		this.noOfStands=1;
		this.noOfHelmets=2;
		this.BikeCategory="Sports";
	}

	
	Bike(int noOfStands, int noOfHelmets, String bikeCategory) {
		super();
		this.noOfStands = noOfStands;
		this.noOfHelmets = noOfHelmets;
		BikeCategory = bikeCategory;
	}
	int getNoOfStands() {
		return noOfStands;
	}

	void setNoOfStands(int noOfStands) {
		this.noOfStands = noOfStands;
	}

	int getNoOfHelmets() {
		return noOfHelmets;
	}

	void setNoOfHelmets(int noOfHelmets) {
		this.noOfHelmets = noOfHelmets;
	}

	String getBikeCategory() {
		return BikeCategory;
	}

	void setBikeCategory(String bikeCategory) {
		BikeCategory = bikeCategory;
	}
	
	void display()
	{
		super.display();
		System.out.println("NO of Stands:"+this.noOfStands);
		System.out.println("No of Helments:"+this.noOfHelmets);
		System.out.println("Bike Category:"+this.BikeCategory);
	}
}

//Car is-a Vehicle
//
//• hasPowerSteering
//• driveMode
//• parkingAssistSensors

class Car extends Vehicle
{
	String hasPowerSteering;
	String driveMode;
	String parkingAssistSensors;
	
	Car()
	{
		super();
		this.hasPowerSteering="yes";
		this.driveMode="yes";
		this.parkingAssistSensors="yes";
	}

	Car(String hasPowerSteering, String driveMode, String parkingAssistSensors) {
		super();
		this.hasPowerSteering = hasPowerSteering;
		this.driveMode = driveMode;
		this.parkingAssistSensors = parkingAssistSensors;
	}

	String getHasPowerSteering() {
		return hasPowerSteering;
	}

	void setHasPowerSteering(String hasPowerSteering) {
		this.hasPowerSteering = hasPowerSteering;
	}

	String getDriveMode() {
		return driveMode;
	}

	void setDriveMode(String driveMode) {
		this.driveMode = driveMode;
	}

	String getParkingAssistSensors() {
		return parkingAssistSensors;
	}

	void setParkingAssistSensors(String parkingAssistSensors) {
		this.parkingAssistSensors = parkingAssistSensors;
	}
	
	void display()
	{
		super.display();
		System.out.println("Has PowerSteering:"+this.hasPowerSteering);
		System.out.println("DriveMode: "+this.driveMode);
		System.out.println("ParkingAssistSensor:"+this.parkingAssistSensors);
	}
	
	
  
}

//Bus is-a Vehicle
//• passengerCapacity
//• standingCapacity

class Bus extends Vehicle
{
	
	int passengerCapacity,standingCapacity;
	Bus()
	{
		super();
		this.passengerCapacity=10;
		this.standingCapacity=10;
	}
	Bus(int vehicleNumber, String model,String companyName,int noOfWheels,double price,int passengerCapacity, int standingCapacity)
	{
		super(vehicleNumber,model,companyName,noOfWheels,price);
		this.passengerCapacity = passengerCapacity;
		this.standingCapacity = standingCapacity;
	}
	int getPassengerCapacity() {
		return passengerCapacity;
	}
	void setPassengerCapacity(int passengerCapacity) {
		this.passengerCapacity = passengerCapacity;
	}
	int getStandingCapacity() {
		return standingCapacity;
	}
	void setStandingCapacity(int standingCapacity) {
		this.standingCapacity = standingCapacity;
	}
	void display()
	{
		super.display();
		System.out.println("passengerCapacity"+this.passengerCapacity);
		System.out.println("standingCapacity:"+this.standingCapacity);
	}
}


 class TestVehicle {

	public static void main(String[] args) {
		 
		Bus b1 = new Bus();
		b1.display();

	}

}
