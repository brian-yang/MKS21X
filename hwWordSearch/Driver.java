public class Driver {
    public static void main(String[] args) {
	// Testing
	/*
	WordSearch crossword = new WordSearch(10, 10);
	crossword.loadWords("words.txt");
	crossword.printWordList();
	System.out.println(crossword);

	WordSearch crossword2 = new WordSearch(7, 7);
	crossword2.loadWords("words.txt");
	crossword2.printWordList();
	System.out.println(crossword2);
	*/
	// Part II
	int[] intArgs = new int[args.length];
	for (int i = 0; i < args.length; i++) {
	    intArgs[i] = Integer.parseInt(args[i]);
	}

	WordSearch puzzle;
	String file = "words.txt";
	if (intArgs.length == 0) {
	    System.out.println("To generate a random WordSearch: java Driver [row col]");
	    System.out.println("To generate a WordSearch with a certain random seed: java Driver [row col [randomSeed]]");
	    System.out.println("To generate the answer key to a WordSearch generated by a specific seed: java Driver [row col [randomSeed [1]]]]");
	    System.out.println("To print out the answer key the fourth arg MUST be 1");
	} else if (intArgs.length == 2) {
	    puzzle = new WordSearch(intArgs[0], intArgs[1], (int) Math.random() * 100000, file);
	    System.out.println(puzzle);
	} else if (intArgs.length == 3) {
	    puzzle = new WordSearch(intArgs[0], intArgs[1], intArgs[2], file);
	    System.out.println(puzzle);
	} else if (intArgs.length == 4) {
	    puzzle = new WordSearch(intArgs[0], intArgs[1], intArgs[2], file);
	    if (intArgs[3] == 1) {
		System.out.println(puzzle.getSolution()); // answer key
	    } else {
		System.out.println(puzzle);
	    }
	}
				
    }
}