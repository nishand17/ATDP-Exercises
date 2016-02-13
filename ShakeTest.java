public class Shakespeare {
  /** read this txt file using files on Piazza to help you.
   * Take a word that is inputted by the user.
   * Find out how many times that word occurs in the file
   * Use test.txt to see if searching for "line" will produce a count of 5.
   *
   */
  public static String[] aryLines;

  public static void main(String[] args) {
  	String file_name = "test.txt";
  	try {
			ReadFile file = new ReadFile(file_name);
			aryLines = file.OpenFile();
		} catch (IOException e) {
			System.out.println(e);
		}
  	int counter = 0;

  	System.out.println("Enter a word here to search all of Shakespeare!");
  	Scanner input = new Scanner(System.in);
  	String userInput = "";
  	userInput = input.next();
  	char[] userInput1 = userInput.toCharArray();
    char[] inputA = userInput.toCharArray();
    char[] matchWord = new char[userInput.length()];
	
	for (int i = 0; i < aryLines.length; i++) {
		char[] line = aryLines[i].toCharArray();
		for (int j = 0; j < line.length; j++) {
			for (int k = 0; k < inputA.length; k++) {
				if (line[j] == inputA[k]) {
					matchWord[k] = line[j];
				}
			}
		}
	}
	if (matchWord == userInput1) {
		counter++;
	}
    System.out.println("There were " + counter + " instances of your word in Shakespeare");
  }

}
