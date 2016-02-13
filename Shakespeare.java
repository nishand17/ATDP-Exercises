import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Scanner;

public class Shakespeare {
  /** read this txt file using files on Piazza to help you.
   * Take a word that is inputted by the user.
   * Find out how many times that word occurs in the file
   * Use test.txt to see if searching for "line" will produce a count of 5.
   *
   */
  public static String[] aryLines;

  public static void main(String[] args) {
  	String file_name = "Shakespeare.txt";
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
  

  	for (int i = 0; i < aryLines.length; i++) {
  		String[] splitLine = aryLines[i].split("\\s");
  		for (int j = 0; j < splitLine.length; j++) {
  			if (splitLine[j].equals(userInput)) {
  				counter++;
  			}
  		}
  	}

    System.out.println("There were " + counter + " instances of your word in Shakespeare");
  }

}



