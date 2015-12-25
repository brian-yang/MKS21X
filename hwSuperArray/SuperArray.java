public class SuperArray{
    private int[] data;
    private int size;

//------------------------------------------------------
    // MAIN
    public static void main(String[] args) {
	SuperArray s1 = new SuperArray();
	System.out.println(s1.size());
	System.out.println(s1);

	SuperArray s2 = new SuperArray(0);
	s2.add(1000);
	System.out.println(s2);
	System.out.println(s2.isEmpty()); // false
	s2.clear();
	System.out.println(s2.isEmpty()); // true
	System.out.println(s2);

	// PART 1
	s2.add(1);
        s2.add(100);
	s2.remove(0);
	System.out.println(s2.get(0));
	s2.remove(0);
	// PART 2
	s2.add(3);
	s2.set(0, 1000);
	s2.clear();
	// PART 3
	System.out.println(s2.isEmpty());
	s2.add(1);
	s2.add(2);
	s2.add(1, 3);
	s2.add(2,100);
	s2.add(5);
	System.out.println(s2);
	System.out.println(s2.size());
	s2.add(s2.size(), 1000);
	s2.add(s2.size(), 5);
	System.out.println(s2.lastIndexOf(5));

	System.out.println(s2.toStringDebug());
	System.out.println(s2.toArray().length);
	System.out.println(s2.size());
    }  

//------------------------------------------------------
    // CONSTRUCTORS
    public SuperArray() {
	data = new int[1];
	size = 0;
    }

    public SuperArray(int[] ary) {
	size = ary.length;
        int[] temp = new int[size];
	for (int i = 0; i < size; i++) {
	    temp[i] = ary[i];
	}
	data = temp;
    }

    public SuperArray(int initialCapacity) {
	if (initialCapacity < 0) {
	    throw new IllegalArgumentException();
	}
	data = new int[initialCapacity];
	size = 0;
    }

//------------------------------------------------------
    // BASIC FUNCTIONS
    public boolean add(int n) {
	if (size + 1 > data.length) {
	    grow();
	}
	data[size] = n;
	size++;
	return true;
    }

    private void grow() {
	int[] data2;
	if (data.length == 0) {
	    data2 = new int[1];
        } else {
	    data2 = new int[data.length * 2];
        }
	for (int i = 0; i < data.length; i++) {
	    data2[i] = data[i];
        }
	data = data2;
    }

    public int get(int index) {
	if (index < 0 || index >= size()) {
	    throw new IndexOutOfBoundsException();
	} 
	return data[index];
    }

    public int size() {
	return size;
    }

    public String toString(){
	String arrayStr = "[";
	if (isEmpty()) {
	    return "[]";
	}
	if (size == 1) {
	    return arrayStr + data[0] + "]";
	}
	for (int i = 0; i < size - 1; i++) {
	    arrayStr += data[i] + ", ";
	}
	arrayStr += data[size - 1] + "]";
	return arrayStr;
    }

    //If you have time this is useful:
    public String toStringDebug(){
	//format the super array like this :   [ 1, 8, 23, 99, -4, 5, X, X, X, X]   
	//(capacity is 10, but only 6 are used)
	//commas between... square bracket start/end and no comma at end.
	//unused slots should be printed as X's.
	String arrayStr = "[";
	if (isEmpty()) {
	    for (int i = 0; i < data.length - 1; i++) {
		arrayStr += "X, ";
	    }
	    arrayStr += "X]";
	    return arrayStr;
	}
	for (int i = 0; i < size - 1; i++) {
	    arrayStr += data[i] + ", ";
	}
	if (size == data.length) {
	    return toString();
	} else {
	    arrayStr += data[size - 1] + ", ";
	    int diff = data.length - size;
	    for (int i = 0; i < diff - 1; i++) {
		arrayStr += "X, ";
	    }
	    arrayStr += "X]";
	    return arrayStr;
	}
    }

//------------------------------------------------------
    // EASY FUNCTIONS
    public void clear() {
	size = 0;
    }
    public boolean isEmpty() {
	return size == 0;
    }
    public int set(int index, int element) {
	if (index < 0 || index >= size()) {
	    throw new IndexOutOfBoundsException();
	}
	int oldElement = data[index];
	data[index] = element;
	return oldElement;
    }

//------------------------------------------------------
    // HARD FUNCTIONS
    public void add(int index, int element) {
	if (index < 0 || index > size()) {
	    throw new IndexOutOfBoundsException();
	}
	if (size == data.length) {
	    grow();
	}
	int previous = data[index];
	int tmp = 0;
	if (index < size) {
	    for (int i = index; i < size; i++) {
		tmp = data[i + 1];
		data[i + 1] = previous;
		previous = tmp;
	    }
	}
	data[index] = element;
	size++;
    }

    public int remove(int index) {
	if (index < 0 || index >= size()) {
	    throw new IndexOutOfBoundsException();
	}
	int oldElement = data[index];
	for (int i = index; i < size - 1; i++) {
	    data[i] = data[i + 1];
	}
        size--;
	return oldElement;
    }

    public int[] toArray() {
	int[] regArray = new int[data.length];
	for (int i = 0; i < data.length; i++) {
	    regArray[i] = data[i];
	}
	return regArray;
    }

    public int indexOf(int n) {
	for (int i = 0; i < size; i++) {
	    if (data[i] == n) {
		return i;
	    }
	}
	return - 1;
    }

    public int lastIndexOf(int n) {
	int lastIndex = -1;
	for (int i = 0; i < size; i++) {
	    if (data[i] == n) {
		lastIndex = i;
	    }
	}
	return lastIndex;
    }

}
