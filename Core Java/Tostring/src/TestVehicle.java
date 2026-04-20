class Vehicle 
{
	int vehicleNumber;
	String model;
	String companyName;
	int noOfWheels;
	double price;
	Vehicle() {
		this.vehicleNumber=0;
		this.model="Not given";
		this.companyName="Not gvien";
		this.noOfWheels=0;
		this.price=0.00;
	}
	Vehicle(int vehicleNumber, String model, String companyName, int noOfWheels, double price) {
		this.vehicleNumber = vehicleNumber;
		this.model = model;
		this.companyName = companyName;
		this.noOfWheels = noOfWheels;
		this.price = price;
	}
	int getVehicleNumber() {
		return vehicleNumber;
	}
	void setVehicleNumber(int vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
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
	@Override
	public
	String toString() {
		return "vehicleNumber=" + vehicleNumber + "\n model=" + model + "\ncompanyName=" + companyName
				+ "\nnoOfWheels=" + noOfWheels + "\nprice=" + price ;
	}
}//class vehicle end here

class Bike extends Vehicle
{
	int noOfStands;
	int noOfHelmets;
	String bikeCategory;
	Bike() {
		super();
		this.noOfStands=0;
		this.noOfHelmets=0;
		this.bikeCategory="Not given";
	}
	Bike(int vehicleNumber, String model, String companyName, int noOfWheels, double price,int noOfStands, int noOfHelmets, String bikeCategory) {
		super(vehicleNumber,model,companyName, noOfWheels,price);
		this.noOfStands = noOfStands;
		this.noOfHelmets = noOfHelmets;
		this.bikeCategory = bikeCategory;
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
		return bikeCategory;
	}
	void setBikeCategory(String bikeCategory) {
		this.bikeCategory = bikeCategory;
	}
	@Override
	public String toString() {
		return super.toString()+ "\n noOfStands=" + noOfStands + "\n noOfHelmets=" + noOfHelmets + "\n bikeCategory=" + bikeCategory
				;
	}
}//class bike ends here

class Car extends Vehicle
{
	String hasPowerSteering;
	String driveMode;
	String parkingAssistSensors;
	Car() {
		super();
		this.hasPowerSteering="Not given";
		this.driveMode="Not given";
		this.parkingAssistSensors="Not given";
	}
	Car(int vehicleNumber, String model, String companyName, int noOfWheels, double price,String hasPowerSteering, String driveMode, String parkingAssistSensors)
	{
		super(vehicleNumber,model,companyName, noOfWheels,price);
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
	@Override
	public String toString() {
		return super.toString()+ "\nhasPowerSteering=" + hasPowerSteering + "\n driveMode=" + driveMode + "\n parkingAssistSensors="
				+ parkingAssistSensors;
	}
	
	
}//class car ends here

class Bus extends Vehicle
{
	int passengerCapacity;
	int standingCapacity;
	Bus() {
		super();
		this.passengerCapacity=0;
		this.standingCapacity=0;
	}
	Bus(int vehicleNumber, String model, String companyName, int noOfWheels, double price,int passengerCapacity, int standingCapacity) {
		super(vehicleNumber,model,companyName, noOfWheels,price);
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
	@Override
	public String toString() {
		return super.toString()+ "\npassengerCapacity=" + passengerCapacity + "\n standingCapacity=" + standingCapacity ;
	}
	
}//class Bus ends here

class TestVehicle {

	public static void main(String[] args) {
		Vehicle v1 =new Vehicle(120,"Baleno","Suzuki",4,1000000);
		v1 = new Bike(103,"Hunter","Royal Enfield",2,250000,1,2,"Sports");
		System.out.println(v1.toString());

	}

}
