package Question3;

public class Circle extends Shape
{
	private double radius;
	public Circle() 
	{
		super();
	}
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double area()
	{
		return 3.14*radius*radius;
	}
}