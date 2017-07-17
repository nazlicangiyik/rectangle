import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class YeniPanel extends JPanel implements KeyListener { // dikdörtgeni
																// hareket
																// ettirmek veya
																// üzerinde
																// deðiþiklik
																// yapmak için
	dortgen a;
	dortgen[] digerleri;
	int adim = 5;
	int elemanSayisi=5;

	// constructor oluþtur
	public YeniPanel() {
		super();
		addKeyListener(this);
		a = new dortgen(300,200, 20, 20); 
	    digerleri = new dortgen [10];
	   digerleri[0]=new dortgen (40,200,20,20);
	   digerleri[1]=new dortgen (100,200,20,20);
	   digerleri[2]=new dortgen (160,200,20,20);
	   digerleri[3]=new dortgen (320,200,20,20);
	   digerleri[4]=new dortgen (640,200,20,20);

	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);// Pencerenin içindeki diðer elemanlarýn
								// oluþmasýný saðlar.
        a.ekranaCiz(g);
	for (int i = 0; i < elemanSayisi; i++) {
		
		digerleri[i].ekranaCiz(g);
	}
        
        
        
	
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// basýlan tuslarý kontrol edelim

		if (e.getKeyCode() == e.VK_UP) {
	       a.hareketEt(0,-adim,digerleri,elemanSayisi);
		   repaint();	
		}

		else if (e.getKeyCode() == e.VK_DOWN) {

			 a.hareketEt(0,adim , digerleri ,elemanSayisi);
			 repaint();		
		}

		else if (e.getKeyCode() == e.VK_RIGHT) {

			 a.hareketEt(adim,0 , digerleri , elemanSayisi);
			 repaint();		
		}

		else if (e.getKeyCode() == e.VK_LEFT) {

			 a.hareketEt(-adim,0,digerleri,elemanSayisi );
			 repaint();		
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}
}
