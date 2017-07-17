import java.awt.Graphics;

public class DaireCiz {
	int x,y;
	int h;
	public DaireCiz(int x, int y, int h) {
		super();
		this.x = x;
		this.y = y;
		this.h = h;
	}
	public void daireYap(Graphics g){
    	g.drawOval(x, y, h, h);
	}
	
	public void genisle(int i){
		x=x-(i/2);
		y=y-(i/2);
		h=h+i;
		
	}
}
