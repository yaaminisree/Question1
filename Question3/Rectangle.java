package Question3;

public class Rectangle extends Shape {
	private double length,breadth;
	public Rectangle() {
	super();
	}
	public Rectangle(double length, double breadth)
	{
	super();
	this.length = length;
	this.breadth = breadth;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getBreadth() {
		return breadth;
	}
	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}
	public double area()
	{
		return length*breadth;
	}
}
