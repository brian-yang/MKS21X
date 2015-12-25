public class Sorts {
    public static void printArray(int[] data) {
	System.out.print("[");
	for (int i = 0; i < data.length - 1; i++) {
	    System.out.print(data[i] + ", ");
	}
	if (data.length >= 1) {
	    System.out.print(data[data.length - 1]);
	} else if (data.length == 1) {
	    System.out.print(data[0]);
	}
	System.out.print("]\n");
    }

    public static void insertionSort(int[] data) {
	for (int i = 0; i < data.length - 1; i++) {
	    if (data[i] > data[i + 1]) {
		int tmp = data[i + 1];
		data[i + 1] = data[i];
		data[i] = tmp;
		swapBackward(data, tmp, i);
	    }
	}
    }

    private static void swapBackward(int[] data, int val, int indexVal) {
	while (indexVal - 1 >= 0 && val < data[indexVal - 1]) {
	    data[indexVal] = data[indexVal - 1];
	    data[indexVal - 1] = val;
	    indexVal--;
	}
    }
}
