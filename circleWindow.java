
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class circleWindow extends JPanel implements ActionListener, MouseListener {
	circle[] myCircles;
	int numCircle = 0;
	int maxCircle = 10;
	int more = 2;

	public circleWindow() {
		super();
		myCircles = new circle[maxCircle];

		Timer time = new Timer(100, this);
		time.start();
	}

	public void paintComponent(Graphics g) {
		addMouseListener(this);
		super.paintComponent(g);
		for (int i = 0; i < maxCircle; i++) {
			if (myCircles[i]==null) {
				myCircles[i]=new circle(0, 0, 0);
			}
			myCircles[i].paintTheMonitor(g);
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// çemberlerin geniþliðini arttýr.
		for (int i = 0; i < numCircle; i++) {
			if (myCircles[i].isActive()) {
				myCircles[i].expand(more);
			}
		}
		repaint();
	}
	
	int eventid=0;

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.hashCode() !=eventid) {
			eventid=e.hashCode();
			if (numCircle <= maxCircle) {
				myCircles[numCircle].setX(e.getX());
				myCircles[numCircle].setY(e.getY());
				myCircles[numCircle].setActive(true);
				numCircle++;
			}
		}
		
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
