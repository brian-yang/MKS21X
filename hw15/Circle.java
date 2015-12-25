public class Circle extends Shape {
    private double radius;

    public Circle() {
	radius = 1.0;
    }

    public Circle(double radius) {
	this.radius = radius;
    }

    public void setRadius(double radius) { this.radius = radius; }
    public double getRadius() { return radius; }
    
    public String toString() {
	return "A Circle with radius = " + getRadius() + ", which is a subclass of " + super.toString();
    }
    
    public double getArea() {
	return Math.PI * radius * radius;
    }

    public double getPerimeter() {
	return 2 * Math.PI * radius;
    }

}
