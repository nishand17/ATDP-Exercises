/*
 * Construct a spaceship class that fulfills the following:
 * Your class must have a name, a maxFuel, fuel, and ways to modify maxFuel and fuel.
 * Your class must keep track of number of crewmembers and be able to add and remove crew.
 * You must also keep track of food. Food is increased with the grow method and decreased with the eat method.
 * Your class must obey all 4 OOP principles. (You won't need polymorphism for this though.)
 */

public class Vehicle {
	private static String name;
	private static int maxFuel;
	private int fuel;

	public Vehicle(String name, int maxFuel, int fuel) {
		this.name = name;
		this.maxFuel = maxFuel;
		this.fuel = fuel;
	}

	public static String getName() {
		return name;
	}
	public int getFuel() {
		return fuel;
	}

	public void move(int fuelBurned) {
		//ensures fuel never drops below 0
		fuel = Math.max(fuel - fuelBurned, 0);
	}

	public void refuel(int fuel) {
		this.fuel = Math.min(this.fuel + fuel, maxFuel);
	}

	public boolean full() {
		return fuel == maxFuel;
	}

	public void setMax(int max) {
		this.maxFuel = max;
	}

	public int getMax() {
		return maxFuel;
	}
}