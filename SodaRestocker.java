/*
Create a class whose purpose is to restock the SodaMachine until it has enough.

Rules:
	1. You may only add 5 cans of soda at a time with no mix-&-matching. 
		(e.g. 5 sprokes or 5 mountainMists, not 3 sprokes and 2 mountainMists)

	2. SodaRestocker's constructor should take in a SodaMachine. 

	3. in the while loop of the main method, print out the number of each soda after every restocking.
*/
public class SodaRestocker {

	//your methods below

	public static void main(String[] args) {
		SodaMachine sodaMachine = new SodaMachine(0, 0, 0);

		while (!sodaMachine.hasEnough()) {
			if (sodaMachine.checkSproke() < 30) {
				sodaMachine.setSproke(5);
				System.out.println("Sproke = " + sodaMachine.checkSproke());
				System.out.println("mountainMist = " + sodaMachine.checkMountainMist());
				System.out.println("FizzBuzz = " + sodaMachine.checkFizzBuzz());
			}
			else if (sodaMachine.checkMountainMist() < 30) {
				sodaMachine.setMountainMist(5);
				System.out.println("Sproke = " + sodaMachine.checkSproke());
				System.out.println("mountainMist = " + sodaMachine.checkMountainMist());
				System.out.println("FizzBuzz = " + sodaMachine.checkFizzBuzz());
			}
			else if (sodaMachine.checkFizzBuzz() < 30) {
				sodaMachine.setfizzBuzz(5);
				System.out.println("Sproke = " + sodaMachine.checkSproke());
				System.out.println("mountainMist = " + sodaMachine.checkMountainMist());
				System.out.println("FizzBuzz = "+ sodaMachine.checkFizzBuzz());
			}
			else {
				System.out.println("");
			}
		}

	}

}