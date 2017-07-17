import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;
import javax.swing.Timer;


public class KarePencere extends JPanel implements ActionListener,MouseListener {

	int x,y;
	int h,w;
	int more=5;
	public KarePencere(){
		super();
        x=50;	
	    y=50;   
	    h=50;
	    w=50;
	    
	    Timer time = new Timer(100,this);
	    time.start();
	} 
	public void paintComponent (Graphics g){
		//it paints window again and again
		addMouseListener(this);
		super.paintComponent(g);
		g.drawOval(x, y, h, w);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//x+=more;//it goes 4 ms more than before. 
		//y+=more;
		h+=more;
		w+=more;		
		repaint();
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		x=e.getX()-(h/2);
		y=e.getY()-(h/2);
		//h=0; //these are for little circle that is growing up from somewhere that h=0,w=0 
		//w=0;
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}
