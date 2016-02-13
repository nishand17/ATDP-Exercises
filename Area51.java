/*
 * This is Area 51. Everything in this class must be top secret. The public can only know what we choose to let them know.
 * There is a breach in security and the public has access to too much. Fix the code below to ensure that Area51 follows  * encapsulation rules. 
 */
public class Area51 {
	private int numberOfAliens;
	private String nuclearLaunchCode;
	private boolean exists;

	public Area51(int aliens, String code, boolean exists) {
		numberOfAliens = aliens;
		nuclearLaunchCode = code;
		this.exists = exists;
	}

	public int getNumberOfAliens() {
		return this.numberOfAliens;
	}

	public String getCode() {
		return this.nuclearLaunchCode;
	}

	public boolean getExists() {
		return this.exists;
	}

	public void setNumberOfAliens(int a) {
		this.numberOfAliens = a;
	}

	public void setCode(String b) {
		this.nuclearLaunchCode = b;
	}

	public void setExists(boolean c) {
		this.exists = c;
	}
}
