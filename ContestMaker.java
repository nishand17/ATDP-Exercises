//This file creates my objects
import static java.lang.Math.random;
public class ContestMaker {

	private String direction = "On Target";
	private int numberOfBalls;
	private int pointsScored = 0;

	public ContestMaker(int numberOfBalls) {
		this.numberOfBalls = numberOfBalls;
	}

	//My Getter and Setter Methods
	public String getDirection() {
		return direction;
		
	}

	public int getNumberBalls() {
		return numberOfBalls;
		
	} 

	public int getPointsScored() {
		return pointsScored;
		
	}

	public void setDirection(String x) {
		 this.direction = x;
		
	}

	public int setBalls(int x) {
		 this.numberOfBalls = x;
		 return numberOfBalls;
		
	}

	public int setPoints(int x) {
		 this.pointsScored = x;
		 return pointsScored;
		
	}
		public int shootingHoops() {
		//finds number of hoops made
		for (int i = 0; i < numberOfBalls; i++) {
			double probability = Math.random();
			if (probability < .5) {
				setPoints(pointsScored + 1);
			}
			else {
				setPoints(pointsScored);
			}
		}
		numberOfBalls = 0;
		return pointsScored;

	}
}