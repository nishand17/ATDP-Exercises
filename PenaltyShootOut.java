/*
Create any object you want so long as it follows the requirements below.

REQUIREMENTS

	1. Must have atleast 3 fields. All must be private.
	2. Must have a way to get and change the values of all fields.
	3. Must have a non-empty constructor.
	4. Must incorporate one loop OR one recursive method somewhere.
	5. Write clean readable code.
	6. Must have a main method.
	7. Be creative

In your main method, call each method once and print out the result of any method that returns a non-void value.
You should rename this file if you use it.

Example:
1. Create a spaceship that can keep track of number of crew, supplies, missiles, speed. 
   Can fire missiles, change speed, feed crew using supplies, etc.
*/

public class PenaltyShootOut {
	private int difficulty;
	private int numballs;
	private int points;

	public PenaltyShootOut(int difficulty, int numballs, int points) {
		this.difficulty=difficulty;
		this.numballs=numballs;
		this.points=points;
	}



	public int getDifficulty() {
		return difficulty;
	}
	public int getNumBalls() {
		return numballs;
	}
	public int getPoints() {
		return points;
	}
	


	public void setDifficulty(int difficulty) {
		this.difficulty = difficulty;
	}
	public void setNumBalls(int numballs) {
		this.numballs = numballs;
	}
	public void addPoints(int points) {
		this.points+=points;
	}


}