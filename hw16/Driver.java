public class Driver {
    public static void main(String[] args) {
	int[] arrayName = {-16002436, 315351, 135, 340634};
	Sorts.printArray(arrayName);
	Sorts.insertionSort(arrayName);
	Sorts.printArray(arrayName);
	// tested on 0 elements, 1 element, repeated elements
    }
}
