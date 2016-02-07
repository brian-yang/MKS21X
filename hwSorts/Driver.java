public class Driver {
    public static void main(String[] args) {
	// Insertion Sort
	int[] arr = {1, 0, -525262, 3, 1000, 153135, 100, -151151515};
	Sorts.printArray(arr);
	System.out.println("--Begin sort!--");
	Sorts.insertionSort(arr);
	System.out.println("--Finished!--");
	Sorts.printArray(arr);

	// Selection Sort
	arr = new int[] {1, 0, -525262, 3, 1000, 153135, 100, -151151515};
	Sorts.printArray(arr);
	System.out.println("--Begin sort!--");
	Sorts.selectionSort(arr);
	System.out.println("--Finished!--");
	Sorts.printArray(arr);

	// Bubble Sort
	arr = new int[] {1, 0, -525262, 3, 1000, 153135, 100, -151151515};
	Sorts.printArray(arr);
	System.out.println("--Begin sort!--");
	Sorts.bubbleSort(arr);
	System.out.println("--Finished!--");
	Sorts.printArray(arr);

    }
}
