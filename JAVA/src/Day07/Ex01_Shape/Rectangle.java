package Day07.Ex01_Shape;

public class Rectangle extends Shape{
	double width,height;
	public Rectangle() {
		this(0,0);
	}
	
	public Rectangle(double width,double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return width*height;
	}

	@Override
	double round() {
		// TODO Auto-generated method stub
		return width*2+height*2;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	

}
