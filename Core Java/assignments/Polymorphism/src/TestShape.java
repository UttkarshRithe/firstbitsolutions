
class Shape 
{
	double  area;
	void calculateArea()
	{
		System.out.println("Super class calculateArea function called");
	}
}

class Triangle extends Shape
{
	int base,height;
	

	Triangle(int base, int height) {
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
		this.area=(0.2)*this.base*this.height;
		System.out.println("Area of triangle:"+this.area);
	}
	
}
class Rectangle extends Shape
{
	int breadth,length;

	Rectangle(int breadth, int length) {
	
		this.breadth = breadth;
		this.length = length;
	}

	int getBreadth() {
		return breadth;
	}

	void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	int getLength() {
		return length;
	}

	void setLength(int length) {
		this.length = length;
	}
	void calculateArea()
	{
		this.area = this.length*this.breadth;
		System.out.println("Area of Rectangle:"+this.area);
	}
}
class Circle extends Shape
{
	int radius;

	Circle(int radius) {
		this.radius = radius;
	}

	int getRadius() {
		return radius;
	}

	void setRadius(int radius) {
		this.radius = radius;
	}
	void calculateArea()
	{
		this.area = 3.14*this.radius*this.radius;
		System.out.println("Area of circle:"+this.area);
	}
	
}

public class TestShape {

	public static void main(String[] args) {
		
	Shape s1;	
	s1 = new Triangle(10,20);
	s1.calculateArea();
	s1 = new Rectangle(5,5);
	s1.calculateArea();
	s1 = new Circle(10);
	s1.calculateArea();
	}

}
