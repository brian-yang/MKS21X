import java.util.Random;
import java.util.ArrayList;

public class RandomArray {
    public static void main(String[] args) {
	// Variables
	Integer randomInt;
	int N = Integer.parseInt(args[0]);
	ArrayList<Integer> randArr = new ArrayList<Integer>();
	Random random = new Random();
	// Random random = new Random(1);

	// Array storing and printing
	System.out.print("[");

	for (int i = 0; i < N - 1; i++) {
	    randomInt = new Integer(random.nextInt(6));
	    randArr.add(randomInt);
	    System.out.print(randomInt + ", ");
	}
	randomInt = random.nextInt(6);
	randArr.add(randomInt);
	System.out.print(randomInt);

	System.out.print("]\n");
    }
}
