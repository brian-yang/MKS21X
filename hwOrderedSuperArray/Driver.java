public class Driver {
    public static void main(String[] args) {
	SuperArray container = new OrderedSuperArray();
	container.add(10);
	container.add(15);
	container.add(100);
	container.add(12);
	container.add(-50);
	container.add(15);
	container.add(85);
	System.out.println(container.indexOf(85));
	System.out.println(container.indexOf(1000));
	System.out.println(container.indexOf(15));

	System.out.println(container);
    }
}
