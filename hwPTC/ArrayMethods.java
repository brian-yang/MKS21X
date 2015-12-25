public class ArrayMethods{
    public static void main(String[] args) {
	int[][] test = {{20,50,30}, {5,1,6}, {1,1,7}};
	// Max
	System.out.println(max(test));

	// Sums
	System.out.println(rowSum(test, 1));
	System.out.println(columnSum(test, 2));

	// All Row Sums Check
	int[] allRowSumsCheck = allRowSums(test);
	System.out.print("[");
	for (int i = 0; i < allRowSumsCheck.length; i++) {
	    System.out.print("<" + allRowSumsCheck[i] + ">");
	}
	System.out.println("]");

	// IsMagic?
	System.out.println(isRowMagic(test));
	System.out.println(isColumnMagic(test));

	// IsSquare?
	System.out.println(isSquare(test));
    }


    public static int max(int[][] AR) {
	int max = 0;
	for (int i = 0; i < AR.length; i++) {
	    for (int j = 0; j < AR[i].length; j++) {
		if (AR[i][j] > max) {
		    max = AR[i][j];
		}
	    }
	}
	return max;
    }
    //returns the maximum value in the 2d parameter array AR.

    public static int rowSum(int[][] AR, int x){
	int sum = 0;
	for (int i = 0; i < AR[x].length; i++) {
	    sum += AR[x][i];	
	}
	return sum;
    }
    //returns the sum of the elements in Row x of AR. 

    public static int columnSum(int[][] AR, int x){
	int sum = 0;
	for (int i = 0; i < AR.length; i++) {
	    if (AR[i].length > x) {
		sum += AR[i][x];
	    }
	}
	return sum;
    }
    //returns the sum of the elements in Column x of AR (careful with rows of different lengths!).

    public static int[] allRowSums(int[][] AR){
	int[] rowSum = new int[AR.length];
	for (int i = 0; i < AR.length; i++) {
	    rowSum[i] = rowSum(AR, i);
	}
	return rowSum;
    }
    //calculates the row sum for every row and returns each of the values in an array. 
    //Index i of the return array contains the sum of elements in row i.

    public static boolean isRowMagic(int[][] AR){
	int rowZeroSum = rowSum(AR, 0);
	for (int i = 1; i < AR.length; i++) {
	    if (rowSum(AR, i) != rowZeroSum) {
		return false;
	    }
	}
	return true;
    }
    //checks if the array is row-magic (this means that every row has the same row sum).

    public static boolean isColumnMagic(int[][] AR){
	int colZeroSum = columnSum(AR, 0);
	for (int i = 1; i < AR.length; i++) {
	    if (columnSum(AR, i) != colZeroSum) {
		return false;
	    }
	}
	return true;
    }
    //checks if the array is column-magic (this means that every column has the same column sum).

    public static boolean isSquare(int[][] AR){
	for (int i = 0; i < AR.length; i++) {
	    if (AR[i].length != AR.length) {
		return false;
	    }
	}
	return true;
    }
    //checks if the array is square (i.e. every row has the same length as AR itself).
}
