import java.util.*;
import java.io.*;

public class MakePigLatin {
    public static void main(String[] args) {
	try {
	    // Part 1
	    String word = "";
	    Scanner in = new Scanner(new File("words.txt"));
	    while (in.hasNextLine()) {
		word = in.nextLine();
		if (!word.trim().equals("")) { // trim removes trailing whitespace
		    System.out.println(pigLatin(word));
		}
	    }
	    in.close();
	    // ----------------------------------------------
	    // Part 2
	    String lineIn = "";
	    String lineOut = "";
	    String[] words = lineIn.split(" ");
	    in = new Scanner(new File("story.txt"));
	    while (in.hasNextLine()) {
		lineIn = in.nextLine();
		if (!lineIn.trim().equals("")) { // trim removes trailing whitespace
		    // pigLatinfy all words in the story
		    words = lineIn.split(" ");
		    for (int i = 0; i < words.length; i++) {
			lineOut += pigLatin(words[i]) + " ";
		    }
		    // Result
		    System.out.print(lineOut + "\n");
		    // Update
		    lineOut = "";
		} else { 
		    System.out.println();
		}
	    }
	    in.close();
	    // ----------------------------------------------
	} catch (FileNotFoundException e) {
	    System.out.println(e.getMessage());
	}
    }

    public static String pigLatin(String s) {
	String vowels = "aeiouAEIOU";
	String alphabet = "abcdefghijklmnopqrstuvwxyz";
	// IF FIRST LETTER IS A VOWEL
	if (vowels.contains(s.substring(0, 1)) || s.length() == 1) {	    
	     if ( !alphabet.contains( s.substring(s.length() - 1, s.length()).toLowerCase() ) ) {
		return s.substring(0, s.length() - 1) + "yay" + s.substring(s.length() - 1, s.length());
	     }
	     return s + "yay";
	}
	// IF FIRST LETTER IS A CONSONANT
	else {
	    String punctuation = "!@#$%^&*(){}[]<>?,./\\;:'\"-=";
	    String[] nonLtrsInd = new String[s.length()]; // indexes of nonletters
	    int initLength = s.length();
	    // stores punctuation marks
	    for (int i = 0; i < s.length(); i++) {
		if (punctuation.contains(s.substring(i, i + 1))) {
		    nonLtrsInd[i] = s.substring(i, i + 1);
		    s = s.substring(0, i) + s.substring(i + 1);
		} else {
		    nonLtrsInd[i] = "";
		}
	    }
	    // cycles through word until a vowel is found
	    int j = 0;
	    while (j != s.length() && !vowels.contains(s.substring(0, 1)) ) {
		s = s.substring(1) + s.substring(0, 1);
		j++;
	    }
	    // adds puncutation marks
	    for (int i = 0; i < initLength; i++) {
		if (i != initLength - 1) {
		    s = s.substring(0, i) + nonLtrsInd[i] + s.substring(i);
		} else {
		    return s + "ay" + nonLtrsInd[i];
		}
	    }
	    return s + "ay";
	}

    }


}
