import java.io.*;

public class OrderedSuperArray extends SuperArray {
    public OrderedSuperArray() {
	super();
    }

    public OrderedSuperArray(int initialCapacity) {
	super(initialCapacity);
    }

    public OrderedSuperArray(int[] ary) {
	for (int i = 0; i < ary.length; i++) {
	    add(ary[i]);
	}
    }

    public int set(int index, int val) {
	int previousVal = remove(get(index));
	this.add(val);
	return previousVal;
	
    }
    public void add(int index, int val) {
	throw new UnsupportedOperationException();
    }

    public boolean add(int val) {
	int index = addIndexBinary(val);
	super.add(index, val);
	return true;
    }

    // linear search
    private int addIndexLinear(int val) {
	for (int i = 0; i < size(); i++) {
	    if (val < get(i)) {
		return i;
	    }
	}
	return size();
    }
    
    // binary search
    private int addIndexBinary(int val) {
	int start = 0;
	int end = size();
	int nextIndex = (start + end) / 2;
	while (start < end) {
	    if (get(nextIndex) > val) {
		end = nextIndex;
	    } else if (get(nextIndex) < val) {
		start = nextIndex + 1;
	    } else if (get(nextIndex) == val) {
		return nextIndex;
	    }
	    nextIndex = (start + end) / 2;
	}
	return nextIndex;
    }

    // indexOf using binary search
    public int indexOf(int val) {
	int start = 0;
	int end = size();
	int nextIndex = (start + end) / 2;
	int index = -1;
	while (start < end) {
	    if (get(nextIndex) > val) {
		end = nextIndex;
	    } else if (get(nextIndex) < val) {
		start = nextIndex + 1;
	    } else if (get(nextIndex) == val) {
		index = nextIndex;
		end = nextIndex;
	    }
	    nextIndex = (start + end) / 2;
	}
	return index;
    }	

}
