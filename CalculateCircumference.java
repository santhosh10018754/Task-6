package task6;

class Circle {

	private double radius;

	public Circle() {
		
	}
	public Circle(double radius) {
		this.radius = radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double calculateCircumference() {
		return 2*3.14*radius;
	}
}

public class CalculateCircumference {

	public static void main(String[] args) {
Circle circle = new Circle(20);
		
		System.out.println("Circumference: "+circle.calculateCircumference());


	}

}
