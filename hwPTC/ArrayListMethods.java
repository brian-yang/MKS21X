import java.util.*;

public class ArrayListMethods{

    /*Remove any consecutive duplicates in the ArrayList

     *@param L The values which may contain duplicates 
     */
    public static void collapseDuplicates( ArrayList<Integer> L ) { 
	for (int i = 1; i < L.size();) {
	    if (L.get(i).equals(L.get(i - 1))) {
		L.remove(i - 1);
	    } else {
		i++;
	    }
	}
    }

    /*Change the order of the elements of L into a random permutation

     *@param L The values to be put into random order

     */
    public static void randomize( ArrayList<Integer> L) {
	Random rng = new Random();
	Integer tmp1, tmp2;
	Integer randInd1, randInd2;
	int limit = L.size();
	for (int i = 0; i < limit; i++) { // number of times to swap
	    randInd1 = new Integer( rng.nextInt(L.size()) );
	    randInd2 = new Integer( rng.nextInt(L.size()) );
	    while (randInd2 == randInd1 && L.size() > 1) {
		randInd2 = rng.nextInt(L.size());
	    }
	    tmp1 = L.get(randInd1);
	    tmp2 = L.get(randInd2);
	    L.set(randInd1, tmp2);
	    L.set(randInd2, tmp1);
	}
    }
    //How many operations do you perform on a list of size N? (in terms of N)

    //How much extra space did you use in order to complete this problem? (in terms of N)

    //Try to use less space/fewer operations. 

    //->The minimum would be NO extra space, and just k*N operations, for a small integer k.



    public static void main(String[]args){
	ArrayList<Integer> testMethods = new ArrayList<Integer>();
	testMethods.add(new Integer(21536));
	testMethods.add(new Integer(221536247));
	testMethods.add(new Integer(2));
	testMethods.add(new Integer(3));
	testMethods.add(new Integer(5));
	testMethods.add(new Integer(5));
        collapseDuplicates(testMethods);
	randomize(testMethods);
	System.out.println(testMethods.toString());
    }
}
