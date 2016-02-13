public class Point {
	int x;
	int y;
	
	public double distanceFromOrigin() {
		double dist = Math.sqrt(x*x + y*y);
		return dist;
	}
	
	public double distance(Point other) {
		int dx = other.x - x;
		int dy = other.y - y;
		double dist = Math.sqrt(dx*dx + dy*dy);
		return dist;
	}
	
	public void translate(int dx, int dy) {
		x = x + dx;
		y = y + dy;
	}
	
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
}