public class Triangle {

    private Coordinate v1, v2, v3;
    private double ab, ac, bc;

    public Triangle() {
	// Coords
	v1 = new Coordinate(1, 0);
	v2 = new Coordinate(0, Math.sqrt(3));
	v3 = new Coordinate(-1, 0);
	// Side lengths
	ab = v1.dist(v2);
	ac = v1.dist(v3);
	bc = v2.dist(v3);
    }

    //1 
    public Triangle(Coordinate a, Coordinate b, Coordinate c) {
	// Coords
	v1 = a;
	v2 = b;
	v3 = c;
	// Side lengths
	ab = v1.dist(v2);
	ac = v1.dist(v3);
	bc = v2.dist(v3);
    }

    //2
    public Triangle(double x1,double y1,double x2,double y2,double x3,double y3) {
	// Coords
	v1 = new Coordinate(x1, y1);
	v2 = new Coordinate(x2, y2);
	v3 = new Coordinate(x3, y3);
	// Side lengths
	ab = v1.dist(v2);
	ac = v1.dist(v3);
	bc = v2.dist(v3);
    }

    //3
    public String toString() {
        return "AB Side Length: " + ab + " | " +
	       "AC Side Length: " + ac + " | " +
	       "BC Side Length: " + bc;
    }

    //4
    public double getPerimeter() {
        return ab + ac + bc;
    }

    //5
    public double getArea() {
	double semiPer = getPerimeter() / 2.0;
	double squared = semiPer * (semiPer - ab) * (semiPer - ac) * (semiPer - bc);
	return Math.sqrt(squared);
    }

    //6 use your smarts, remember for booleans || is or, && is and.
    //e.g.    x > 0 || x < 0
    public boolean isRight() {
	if (ab <= 0 || ac <= 0 || bc <= 0) {
		return false;
	}
        return (ab * ab + ac * ac == bc * bc) ||
	       (ab * ab + bc * bc == ac * ac) ||
	       (ac * ac + bc * bc == ab * ab);
    }

}

