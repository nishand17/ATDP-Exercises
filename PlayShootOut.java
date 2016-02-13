import java.util.Scanner;
import static java.lang.Math.random;

public class PlayShootOut {
	

	public static void main(String[] args) {
		System.out.println("Welcome to a Soccer Penalty Shoot-Out! Try to score and avoid the goalkeeper!");
		Scanner input = new Scanner(System.in);
		PenaltyShootOut shootOut = new PenaltyShootOut(0, 0, 0);
		System.out.println("Enter your difficulty, either 1 or 2");
		shootOut.setDifficulty(Integer.parseInt(input.next()));
		System.out.println("Enter the number of balls you want to shoot from 5-8");
		shootOut.setNumBalls(Integer.parseInt(input.next()));
		for (int i=1; i<=shootOut.getNumBalls(); i++) {
			System.out.println("This is shot number " + i + " out of " + shootOut.getNumBalls());
			if (shootOut.getDifficulty()==1) {
				System.out.println("Enter your direction for this shot: ");
				System.out.println("_____________");
				System.out.println("|  1  |  2  |");
				System.out.println("|_____|_____|");
				System.out.println("|  3  |  4  |");
				System.out.println("|_____|_____|");
				int direction = Integer.parseInt(input.next());
				System.out.println("Enter your power for this shot from 1-20 (remember too high can go over the net!: ");
				int power = Integer.parseInt(input.next());
				int goalkeeperdive = (int)((Math.random() * 4) + 1);
				if ((goalkeeperdive==1&&direction==1)||(goalkeeperdive==2&&direction==2)||(goalkeeperdive==3&&direction==3)||(goalkeeperdive==4&&direction==4)) {
					System.out.println("He shoots! The goalkeeper is going the same direction!");
					if (power==14||power==15) {
						System.out.println("Ooh! The goalkeeper had a touch on it but it goes in!");
						System.out.println("________   ________        _                   ");
						System.out.println("|          |      |       / \\       |          ");
						System.out.println("|          |      |      /   \\      |          ");
						System.out.println("|    ___   |      |     /_____\\     |          ");
						System.out.println("|      |   |      |    /       \\    |          ");
						System.out.println("|______|   |______|   /         \\   |______    ");
						shootOut.addPoints(1);
					} else if (power>15) {
						System.out.println("The ball flies high but the keeper was diving that direction anyways. . .");
					} else if (power<5) {
						System.out.println("That was an easy save for the keeper . . .");
					} else {
						System.out.println("What a save by the goalkeeper!");
					}
				} else if (power>15) {
					System.out.println("The ball flies too high! It should have gone in!");
				} else if (power<5) {
					System.out.println("What a disappointing shot! The keeper had too much time to get to it.");
				} else {
					System.out.println("The ball finds the back of the net, and he is happy with that strike!");
						System.out.println("________   ________        _                   ");
						System.out.println("|          |      |       / \\       |          ");
						System.out.println("|          |      |      /   \\      |          ");
						System.out.println("|    ___   |      |     /_____\\     |          ");
						System.out.println("|      |   |      |    /       \\    |          ");
						System.out.println("|______|   |______|   /         \\   |______    ");
					shootOut.addPoints(1);
				}
			}


			if (shootOut.getDifficulty()==2) {
				System.out.println("Enter your direction for this shot: ");
				System.out.println("_____________");
				System.out.println("|  1  |  2  |");
				System.out.println("|_____|_____|");
				System.out.println("|  3  |  4  |");
				System.out.println("|_____|_____|");
				int direction = Integer.parseInt(input.next());
				System.out.println("Enter your power for this shot from 1-20 (remember too high can go over the net!: ");
				int power = Integer.parseInt(input.next());
				int goalkeeperdive = (int)((Math.random() * 4) + 1);
				if (goalkeeperdive==4) {
					goalkeeperdive=direction;
				}
				if ((goalkeeperdive==1&&direction==1)||(goalkeeperdive==2&&direction==2)||(goalkeeperdive==3&&direction==3)||(goalkeeperdive==4&&direction==4)) {
					System.out.println("He shoots! The goalkeeper is going the same direction!");
					if (power==15) {
						System.out.println("Ooh! The goalkeeper had a touch on it but it goes in!");
						System.out.println("________   ________        _                   ");
						System.out.println("|          |      |       / \\       |          ");
						System.out.println("|          |      |      /   \\      |          ");
						System.out.println("|    ___   |      |     /_____\\     |          ");
						System.out.println("|      |   |      |    /       \\    |          ");
						System.out.println("|______|   |______|   /         \\   |______    ");
						shootOut.addPoints(1);
					} else if (power>13) {
						System.out.println("The ball flies high but the keeper was diving that direction anyways. . .");
					} else if (power<7) {
						System.out.println("That was an easy save for the keeper . . .");
					} else {
						System.out.println("What a save by the goalkeeper!");
					}
				} else if (power>13) {
					System.out.println("The ball flies too high! It should have gone in!");
				} else if (power<7) {
					System.out.println("What a disappointing shot! The keeper had too much time to get to it.");
				} else {
					System.out.println("The ball finds the back of the net, and he is happy with that strike!");
						System.out.println("________   ________        _                   ");
						System.out.println("|          |      |       / \\       |          ");
						System.out.println("|          |      |      /   \\      |          ");
						System.out.println("|    ___   |      |     /_____\\     |          ");
						System.out.println("|      |   |      |    /       \\    |          ");
						System.out.println("|______|   |______|   /         \\   |______    ");
					shootOut.addPoints(1);
				}
			}
		}

		System.out.println("Nice Round! You made " + shootOut.getPoints() + " out of " + shootOut.getNumBalls() + " shots!");


		
	}
}