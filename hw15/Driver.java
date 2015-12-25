public class Driver {
    public static void main(String[] args) {
	Shape circle1 = new Circle();
	System.out.println(circle1);
	System.out.println(circle1.isFilled());
	circle1.setColor("green");
	System.out.println(circle1.getColor());
	System.out.println(circle1);

	Shape circle = new Circle(2.0);
	System.out.println(circle);
	System.out.println(circle.getArea());
	System.out.println(circle.getPerimeter());
	
	Shape rectangle = new Rectangle(2.0, 3.0);
	System.out.println(rectangle);
	System.out.println(rectangle.getArea());
	System.out.println(rectangle.getPerimeter());
	System.out.println(rectangle.getSemiPerimeter());

	Rectangle square = new Square(50.0);
	square.setLength(10.0);
	square.setWidth(30.0);
	System.out.println(square);
	square.setColor("blue");
	System.out.println(square);
	System.out.println(square.getArea());
	System.out.println(square.getPerimeter());
	System.out.println(square.getSemiPerimeter());
    }
}
