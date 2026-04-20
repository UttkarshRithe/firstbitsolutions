//2. Appliance Hierarchy
//
//Appliance
//
//brand
//powerRating
//warrantyYears

class Appliance
{
	String brand;
	int powerRating;
	int warrantyYears;
	
	Appliance()
	{
		this.brand="not given";
		this.powerRating=0;
		this.warrantyYears=0;
	}
	
	Appliance(String brand,int powerRating,int warrantyYears)
	{
		this.brand=brand;
		this.powerRating=powerRating;
		this.warrantyYears=warrantyYears;
	}
	
	String getBrand() {
		return brand;
	}
	
	void setBrand(String brand) {
		this.brand = brand;
	}
	
	int getPowerRating() {
		return powerRating;
	}
	
	void setPowerRating(int powerRating) {
		this.powerRating = powerRating;
	}
	
	int getWarrantyYears() {
		return warrantyYears;
	}
	
	void setWarrantyYears(int warrantyYears) {
		this.warrantyYears = warrantyYears;
	}
	
	void display()
	{
		System.out.println("Brand:"+this.brand);
		System.out.println("Power Rating:"+this.powerRating);
		System.out.println("Warranty Years:"+this.warrantyYears);
	}
}


//WashingMachine is-a Appliance
//
//loadCapacity
//washingType

class WashingMachine extends Appliance
{
	double loadCapacity;
	String washingType;
	
	WashingMachine()
	{
		super();
		this.loadCapacity=0;
		this.washingType="not given";
	}
	
	WashingMachine(String brand,int powerRating,int warrantyYears,
			       double loadCapacity,String washingType)
	{
		super(brand,powerRating,warrantyYears);
		this.loadCapacity=loadCapacity;
		this.washingType=washingType;
	}
	
	double getLoadCapacity() {
		return loadCapacity;
	}
	
	void setLoadCapacity(double loadCapacity) {
		this.loadCapacity = loadCapacity;
	}
	
	String getWashingType() {
		return washingType;
	}
	
	void setWashingType(String washingType) {
		this.washingType = washingType;
	}
	
	void display()
	{
		super.display();
		System.out.println("Load Capacity:"+this.loadCapacity);
		System.out.println("Washing Type:"+this.washingType);
	}
}


//Refrigerator is-a Appliance
//
//capacityInLiters
//hasFreezer

class Refrigerator extends Appliance
{
	int capacityInLiters;
	boolean hasFreezer;
	
	Refrigerator()
	{
		super();
		this.capacityInLiters=0;
		this.hasFreezer=false;
	}
	
	Refrigerator(String brand,int powerRating,int warrantyYears,
			     int capacityInLiters,boolean hasFreezer)
	{
		super(brand,powerRating,warrantyYears);
		this.capacityInLiters=capacityInLiters;
		this.hasFreezer=hasFreezer;
	}
	
	int getCapacityInLiters() {
		return capacityInLiters;
	}
	
	void setCapacityInLiters(int capacityInLiters) {
		this.capacityInLiters = capacityInLiters;
	}
	
	boolean isHasFreezer() {
		return hasFreezer;
	}
	
	void setHasFreezer(boolean hasFreezer) {
		this.hasFreezer = hasFreezer;
	}
	
	void display()
	{
		super.display();
		System.out.println("Capacity In Liters:"+this.capacityInLiters);
		System.out.println("Has Freezer:"+this.hasFreezer);
	}
}


//Test Class

class TestAppliance
{
	public static void main(String[] args)
	{
		WashingMachine w1 = new WashingMachine();
		w1.display();
	}
}