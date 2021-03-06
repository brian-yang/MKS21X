import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.io.File;
import java.io.IOException;

public class WordSearch {
    private char[][]data;
    private ArrayList<String> wordsToAdd;
    private ArrayList<String> wordsAdded;
    private int randSeed;
    private String solution;

    /**Initialize the grid to the size specified and fill all of the positions
     *with spaces.
     *@param row is the starting height of the WordSearch
     *@param col is the starting width of the WordSearch
     *@param randSeed is the random seed used to randomly place words into the
     *WordSearch
     */
    public WordSearch(int rows, int cols, int randomSeed, String file){
	data = new char[rows][cols];
	clear();
	wordsToAdd = new ArrayList<String>();
	wordsAdded = new ArrayList<String>();
	randSeed = randomSeed;
	loadWords(file);
	printWordList();
	fillWithWords(); // solution is stored at the end of fillWithWords
	fillSpaces();
    }

    /**Set all values in the WordSearch to spaces ' '*/
    private void clear(){
	for (int i = 0; i < data.length; i++) {
	    for (int j = 0; j < data[i].length; j++) {
		data[i][j] = ' ';
	    }
	}	
    }

    /**The proper formatting for a WordGrid is created in the toString.
     *@return a String with each character separated by spaces, and each row
     *separated by newlines.
     */
    public String toString(){
	String string = "--------------------------------------\n";
	for (int i = 0; i < data.length; i++) {
	    for (int j = 0; j < data[i].length; j++) {
		string += Character.toString(data[i][j]) + " ";
	    }
	    string += "\n";
	}
	string += "--------------------------------------";
	return string;
    }

    /**Prints the list of words needed to be added into the word search
     *
     */
    public void printWordList() {
	System.out.println("Words to Add: " + wordsToAdd);
    }

    public String getSolution() {
	return solution;
    }

    /**Reads words from the given file into ArrayList wordsToAdd
     *
     *@param fileName is the name of the file containing the words to be
     *used in the word search
     */
    public void loadWords(String fileName) {
	try {
	    Scanner loader = new Scanner(new File(fileName));
	    while (loader.hasNext()) {
		wordsToAdd.add(loader.next().trim());
	    }
	    loader.close();
	} catch(IOException e) {
	    e.printStackTrace();
	}
    }

    public void fillWithWords() {
	Random randomWord = new Random(randSeed);
	String word;
	while (!wordsToAdd.isEmpty()) {
	    int wordIndex = randomWord.nextInt(wordsToAdd.size());
	    word = wordsToAdd.get(wordIndex);
	    int counter = 0;
	    while (addWord(word, randomWord.nextInt(data.length), randomWord.nextInt(data[0].length), randomWord.nextInt(3) - 1, randomWord.nextInt(3) - 1) != true && counter != 10) {
		counter++;
	    }
	    wordsAdded.add(wordsToAdd.remove(wordIndex));
	}
	solution = this.toString();
    }
	    
    public void fillSpaces() {
	for (int i = 0; i < data.length; i++) {
	    for (int j = 0; j < data[0].length; j++) {
		if (data[i][j] == ' ') {
		    data[i][j] = (char) (97 + new Random().nextInt(26));;
		}
	    }
	}
    }

    /**
     *@param word The word you want to add
     *@param row the row where you start the word
     *@param col the column where you start the word
     *@param dr the change in row between letters. Should be -1,0, or 1.
     *@param dc the change in column between letters. Should be -1,0, or 1.
     *@return true when added successfully, false if not.
     */
    private boolean addWord(String word, int row, int col, int dr, int dc) {
	if (dr == 0 && dc == 0) {
	    return false;
	}
	if (boxExists(row, col) && 
	    boxExists(row + (word.length()-1) * dr, col + (word.length()-1) * dc)) {
	    for (int i = 0; i < word.length(); i++) {
		if (data[row][col] != ' ' &&
		    data[row][col] != word.charAt(i)) {
		    return false;
		}
		row += dr;
		col += dc;
	    }
	    row -= word.length() * dr;
	    col -= word.length() * dc;
	    for (int i = 0; i < word.length(); i++) {
		data[row][col] = word.charAt(i);
		row += dr;
		col += dc;
	    }
	    return true;
	}
	return false;
    }

    /**
     *Checks if a box with a given row and column
     *exists within the WordSearch
     *@param row the row of the box
     *@param col the column of the box
     */
    private boolean boxExists(int row, int col) {
	if (row < 0 || col < 0) {
	    return false;
	}
	return (row < data.length && col < data[0].length);
    }
}
