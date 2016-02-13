public class Spaceship extends Vehicle {

	private static int numOfCrew = 0;
	private static int numFood = 0;

	public Spaceship(int numOfCrew, int numFood, String name, int maxFuel, int fuel) {
		super(name, maxFuel, fuel);
		this.numOfCrew = numOfCrew;
		this.numFood = numFood;
	}

	
	public static int getCrew() {
		return numOfCrew;
	}

	public static void addCrew(int x) {
		numOfCrew+= x;
	}

	public static void takeCrew(int y) {
		numOfCrew = Math.max(numOfCrew - y, 0);
	}

	public static int getFood() {
		return numFood;
	}

	public static void grow(int x) {
		numFood+= x;
	}

	public static void eat(int y) {
		numFood = Math.max(numFood - y, 0);
	}

	public static void main(String[] args) {
		Vehicle spaceship = new Spaceship(15, 60, "Explorer", 100, 90);
		System.out.println("Welcome, owner of: " + spaceship.getName() + " | Here is your status report");
		System.out.println("Current level of Crew, Food, MaxFuel, and Fuel are... ");
		System.out.println(getCrew() + ", " + getFood() + ", " + spaceship.getMax() + ", " + spaceship.getFuel());
		System.out.println("Getting fuel, should be 90...");
		System.out.println("Fuel: " + spaceship.getFuel());

		System.out.println("Moving 10...");
		spaceship.move(10);
		System.out.println("After movement fuel: " + spaceship.getFuel());

		System.out.println("Refueling 19...");
		spaceship.refuel(19);
		System.out.println("Fuel: " + spaceship.getFuel());

		System.out.println("Refueling 2...");
		spaceship.refuel(2);
		System.out.println("Fuel: " + spaceship.getFuel());

		System.out.println("Getting crew, should be 15...");
		System.out.println("Crew: " + getCrew());

		System.out.println("Adding 15 crew members...");
		addCrew(15);
		System.out.println("Crew: " + getCrew());

		System.out.println("Taking away 3 members...");
		takeCrew(3);
		System.out.println("Crew: " + getCrew());

		System.out.println("Getting food, should be 60...");
		System.out.println("Food: " + getFood());

		System.out.println("Adding 60 food...");
		grow(60);
		System.out.println("Food: " + getFood());

		System.out.println("Eating 30 food...");
		eat(30);
		System.out.println("Food: " + getFood());


	}
}