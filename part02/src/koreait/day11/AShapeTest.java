package koreait.day11;

public class AShapeTest {

	public static void main(String[] args) {
		Triangle tr = new Triangle(30, 20);
		Circle cir = new Circle();
		cir.setRadius(89);
	}

}


abstract class Ashape{
	protected String shapeName;
	protected int width;
	protected int height;
	
	public abstract double getArea();
	
	public Ashape() {
	}
	
	public Ashape(int width, int height) {
		this.width = width;
		this.height = height;
	}
		
	
}

class Triangle extends Ashape{
		
	
	public Triangle(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getArea() {
		return width * height / 2;
	}
	
		
}

class Circle extends Ashape{

	private int radius;
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return radius * radius * 3.14;
	}
}

class Rectangle extends Ashape{
	public Rectangle(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return width * height;
	}
	
	
}