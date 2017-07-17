import java.awt.Graphics;

public class circle {

	int x, y;
	int hight;
	boolean active;

	public boolean isActive() {
		return active;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	// here is constructor
	public circle(int x, int y, int hight) {
		super();
		this.x = x;
		this.y = y;
		this.hight = hight;
	}

	public void paintTheMonitor(Graphics g) {

		g.drawOval(x, y, hight, hight);

	}

	public void expand(int i) {
		hight = hight + i;
	}

}
