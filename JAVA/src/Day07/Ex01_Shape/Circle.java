package Day07.Ex01_Shape;

public class Circle extends Shape{
	double radius;
	double pi = 3.14;
	
	public Circle() {
		this(0);
	}
	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	@Override
	double area() {
		// TODO Auto-generated method stub
		return (double)radius*radius*pi;
	}

	@Override
	double round() {
		// TODO Auto-generated method stub
		return (double)radius*2*pi;
	}
	
}
