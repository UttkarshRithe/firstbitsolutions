
class Shape 
{
	double  area;
	void calculateArea()
	{
		System.out.println("Area:"+this.area);
	}
	
}
class Triangle extends Shape
{
	int base,height;

	Triangle(int base, int height) {
		super();
		this.base = base;
		this.height = height;
	}

	int getBase() {
		return base;
	}

	void setBase(int base) {
		this.base = base;
	}

	int getHeight() {
		return height;
	}

	void setHeight(int height) {
		this.height = height;
	}
	void calculateArea()
	{
		this.area=0.5*this.base*this.height;
		System.out.println("Area of triangle:"+this.area);
	}
}//class triangle ends here



class Rectangle extends Shape
{
	double breadth,length;

	Rectangle(double breadth, double length) {
		this.breadth = breadth;
		this.length = length;
	}

	double getBreadth() {
		return breadth;
	}

	void setBreadth(double breadth) {
		this.breadth = breadth;
	}

	double getLength() {
		return length;
	}

	void setLength(double length) {
		this.length = length;
	}
	void calculateArea()
	{
		this.area= this.length*this.breadth;
		System.out.println("Area of Rectangle:"+this.area);
	}
	
}// class reatangle ends here


class Circle extends Shape
{
	double radius;

	Circle(double radius) {
		this.radius = radius;
	}

	double getRadius() {
		return radius;
	}

	void setRadius(double radius) {
		this.radius = radius;
	}
	void calculateArea()
	{
		this.area=3.14*this.radius*this.radius;
		System.err.println("Area of Circle:"+this.area);
	}
}//class Circle ends here

public class Test2 {

	public static void main(String[] args) {
		
		Shape s1 = new Shape();
		s1= new Triangle(2,5);
		s1.calculateArea();
		s1= new Rectangle(10,20);
		s1.calculateArea();
		s1= new Circle(2.5);
		s1.calculateArea();
	}

}
