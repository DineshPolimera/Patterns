package in.ineuron.main;
class Shape{
	public double getArea() {
		return 0;
	}
}

class Rectangle extends Shape{
	private double length,width;
	public Rectangle(double length,double width)
	{
		this.length=length;
		this.width=width;
	}
	public double getArea() {
		return length*width;
	}
}

class Circle extends Shape{
	private double radius;
	public Circle(double radius) {
		this.radius=radius;
	}
	public double getArea() {
		return 3.14*radius*radius;
	}
}
public class Demopoly {

	public static void main(String[] args) {
		Shape[] s = new Shape[2];
		
		s[0]= new Circle(2);
		s[1]=new Rectangle(2,3);
		
		System.out.println("Area of Circle : "+s[0].getArea());
		System.out.println("Area of Circle : "+s[1].getArea());

	}

}
