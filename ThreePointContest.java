import static java.lang.Math.random;
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
//This file instantiates my object and runs a Three Point Contest
public class ThreePointContest {
	public static void main(String[] args) {
		ContestMaker contest1 = new ContestMaker(10);
		System.out.println("Before the game runs ...");
		System.out.println("Direction = " + contest1.getDirection());
		System.out.println("Number of balls: " + contest1.getNumberBalls());
		System.out.println("Points Scored: " + contest1.getPointsScored());
		System.out.println("You scored " + contest1.shootingHoops() + " baskets");
		System.out.println("After the game runs ... ");
		System.out.println("Direction = " + contest1.getDirection());
		System.out.println("Number of Balls: " + contest1.getNumberBalls());
		System.out.println("Points Scored: " + contest1.getPointsScored());
	}




}




