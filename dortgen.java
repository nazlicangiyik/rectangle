import java.awt.Graphics;
import java.awt.Rectangle;

public class dortgen {
   Rectangle r;
   
   
 


	public dortgen(int x, int y, int width, int height) {
	// TODO Auto-generated constructor stub

		 r = new Rectangle(x, y, width, height);
		   
	}




	public void ekranaCiz(Graphics g){
		g.drawRect((int)r.getX(),(int)r.getY(), 
				(int)r.getWidth(),(int)r.getHeight());
		g.drawRect(0, 0,620 ,460);
		
	}
	
	public void hareketEt(int x, int y , dortgen digerleri [], int sayi){
	    Rectangle gecici = new Rectangle (r); //daha �nce olu�turdu�um rectangle kullanabiliyorum
	    gecici.setLocation((int)gecici.getX() +x ,(int)gecici.getY() + y);	
		boolean cakisma = false;  // ilk ba�ta �ak��ma s�z konusu de�il.
	    
	    for (int i = 0; i <sayi; i++) {
			if(gecici.intersects(digerleri[i].getRectangle()))
			{
				cakisma = true;
			}
	        
	    }
	    if (gecici.getX()<0|| gecici.getY()<0 ||gecici.getX()>620-gecici.getWidth() || gecici.getY()>440-gecici.getHeight()) {
			cakisma = true;
		}
	    
	    
	    if(cakisma== false)
	    {
		r.setLocation((int)r.getX() +x ,(int)r.getY() + y);	
	    }
	    
	   
	
	}
	public Rectangle getRectangle(){
		return r;
	}
	
}
