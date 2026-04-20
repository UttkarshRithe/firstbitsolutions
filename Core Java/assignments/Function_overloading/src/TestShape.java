
class Shape 
{
	double  area;
	void calculateArea(int base,int height)
	{
		this.area=(0.2)*base*height;
		System.out.println("Area of triangle:"+this.area);
	}
	void calculateArea(double length,double breadth)
	{
		this.area = length*breadth;
		System.out.println("Area of Rectangle:"+this.area);
	}
	void calculateArea(double radius)
	{
		this.area = 3.14*radius*radius;
		System.out.println("Area of circle:"+this.area);
	}
}

class Triangle 
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
	
}
class Rectangle
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
	
}
class Circle
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
	
}

public class TestShape {

	public static void main(String[] args) {
	Shape s1 = new Shape();
	Triangle t1 = new Triangle(10,20);
	Rectangle r1 = new Rectangle(5,5);
	Circle c1 = new Circle(10);
	
	s1.calculateArea(t1.getBase(), t1.getHeight());
	s1.calculateArea(r1.getLength(), r1.getBreadth());
	s1.calculateArea(c1.getRadius());
	
	}

}
