public class Convert {
    public static void main(String[] args) {
	int[] test = {27, 100, 25, 30, 70, 20, 100, 50, 72, 81};
	int rows = 2;
	int cols = 5;
	int[][] test2 = convert(test, rows, cols);
	for (int i = 0; i < rows; i++) {
	    for (int j = 0; j < cols; j++) {
		System.out.print(test2[i][j] + " ");
	    }
	    System.out.println();
	}
    }

    public static int[][] convert(int[] data, int rows, int cols) {
	int[][] data2 = new int[rows][cols];
	int index = 0;
	for (int i = 0; i < rows; i++) {
	    for (int j = 0; j < cols; j++) {
		data2[i][j] = data[index];
		index++;
	    }
	}
	return data2;
    }

}
