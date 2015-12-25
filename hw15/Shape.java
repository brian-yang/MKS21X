public abstract class Shape {
    private String color;
    private boolean filled;

    public Shape() {
	color = "black";
	filled = false;
    }

    public Shape(String color, boolean filled) {
	this.color = color;
	this.filled = filled;
    }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color;}

    public boolean isFilled() { return filled; }
    public void setFilled(boolean filled) { this.filled = filled; }

    public double getSemiPerimeter() {
	return getPerimeter() / 2.0;
    }

    // ABSTRACT METHODS
    public abstract double getArea();
    public abstract double getPerimeter();

    public String toString() {
	String filledStr;
	if (isFilled()) {
	    filledStr = "filled";
	} else {
	    filledStr = "not filled";
	}
	return "A Shape with color of " + getColor() + " and is " + filledStr;
    }
}
