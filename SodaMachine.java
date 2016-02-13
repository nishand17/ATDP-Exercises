/*
The boys at the Soda Company got lazy and didn't finish creating the SodaMachine. 
They've got the number of sodas for each type but it's all private information! 
Make some additions to the SodaMachine class to be able to check how much soda is left. 
Do not set the fields to public. That is cheating.

You must implement:

1. isEmpty() - checks if the machine is completely empty
2. hasEnough() - checks if the amount of each soda is >= 30 (90 sodas total, 30 of each type)
3. Some way to access the number of each type of soda.
*/
public class SodaMachine {
	
	private int sproke;
	private int mountainMist;
	private int fizzBuzz;

	// Tells SodaMachine how much of each type of soda to start with
	public SodaMachine(int sproke, int mountainMist, int fizzBuzz) {
		this.sproke = sproke;
		this.mountainMist = mountainMist;
		this.fizzBuzz = fizzBuzz;
	}

	// Your code below
	public int checkSproke() {

		return sproke;
	}

	public int checkMountainMist() {

		return mountainMist;
	}
	public int checkFizzBuzz() {

		return fizzBuzz;
	}

	public int setSproke(int x) {
		return sproke += x;
	}
	public int setMountainMist(int y) {
		return mountainMist += y;
	}
	public int setfizzBuzz(int z) {
		return fizzBuzz += z;
	}

	public boolean hasEnough() {
		if (fizzBuzz >= 30 && sproke >= 30 && mountainMist >= 30) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean isEmpty() {
		if (fizzBuzz == 0 && sproke == 0 && mountainMist == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	