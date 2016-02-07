import java.io.*;

public class BarCode implements Comparable<Comparable> {
    // instance variables
    private String _zip;
    private int _checkDigit;
    private static String[] _barcodes = {"||:::", ":::||", "::|:|", "::||:",
				       ":|::|", ":|:|:", ":||::", "|:::|",
				       "|::|:", "|:|::"};

    // constructors
    //precondtion: zip.length() = 5 and zip contains only digits.
    //postcondition: throws a runtime exception zip is not the correct length
    //               or zip contains a non digit
    //               _zip and _checkDigit are initialized.
    public BarCode(String zip) {
	if (zip.length() != 5) {
	    throw new RuntimeException();
	}
	for (int i = 0; i < zip.length(); i++) {
	    if (zip.charAt(i) - '0' < 0 || zip.charAt(i) - '0' >= 10) {
		throw new RuntimeException();
	    }
	}
	_zip = zip;
	_checkDigit = checkSum();
    }

    // postcondition: Creates a copy of a bar code.
    public BarCode(BarCode x) {
	this(x._zip);
    }


    //post: computes and returns the check sum for _zip
    private int checkSum() {
	int sum = 0;
	for (int i = 0; i < _zip.length(); i++) {
	    sum += _zip.charAt(i) - '0';
	}
	return sum % 10;
    }

    //postcondition: format zip + check digit + barcode 
    //ex. "084518  |||:::|::|::|::|:|:|::::|||::|:|"      
    public String toString(){
	String info = _zip + Integer.toString(_checkDigit) + " |";
	for (int i = 0; i < 6; i++) {
	    info += _barcodes[info.charAt(i) - '0'];
	}
	return info + "|";
    }


    public boolean equals(Object other) {
	return other instanceof BarCode && compareTo((BarCode) other) == 0;
    }
    // postcondition: false if the object is not a BarCode, 
    // false if it is a non-matching barcode
    // true when they match.


    public int compareTo(Comparable other) {
	/*
	int cmp1 = Integer.parseInt(_zip + Integer.toString(_checkDigit));
	int cmp2 = Integer.parseInt(((BarCode) other)._zip + Integer.toString(((BarCode) other)._checkDigit));
	if (cmp1 > cmp2) {
	    return 1;
	} else if (cmp1 < cmp2) {
	    return -1;
	} else {
	    return 0;
	}
	*/
	return toString().compareTo(other.toString());
    }
    // postcondition: compares the zip + checkdigit 

    public static void main(String[] args) {
	BarCode code = new BarCode("08451");
	System.out.println(code);
	System.out.println(code.checkSum());
	BarCode code2 = new BarCode(code);
	System.out.println(code.equals(code2));
    }
}
