public class Square extends Rectangle {
    public Square() {}

    public Square(double side) {
	super(side, side);
    }

    public void setWidth(double side) {
	super.setLength(side);
	super.setWidth(side);
    }

    public void setLength(double side) {
	setWidth(side);
    }

    public String toString() {
	return "A Square with side = " + getLength() + ", which is a subclass of " + super.toString();
    }

    // Not necessary to override getArea() and getPerimeter()
    // because both methods have been written in the superclass
}
