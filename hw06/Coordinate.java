public class Coordinate {

    private double abscissa, ordinate;

    public Coordinate() {
	abscissa = 0;
	ordinate = 0;
    }

    public Coordinate(double x, double y) {
	abscissa = x;
	ordinate = y;
    }

    // Accessors
    public double getX() {
	return abscissa;
    }

    public double getY() {
	return ordinate;
    }

    // Mutators
    public void setX(double x) {
	abscissa = x;
    }

    public void setY(double y) {
	ordinate = y;
    }

    // Returns Coordinate as a string
    public String toString() {
	return "(" + abscissa + ", " + ordinate + ")";
    }

    // Returns distance from Coordinate to origin
    public double distToOrigin() {
	return Math.pow(abscissa * abscissa + ordinate * ordinate, 0.5);
    }

    // Return distance from given coordinate to THIS coordinate
    public double dist(Coordinate p) {
	double a = p.getX() - abscissa;
	double b = p.getY() - ordinate;
	return Math.pow(a * a + b * b, 0.5);
    }

}
