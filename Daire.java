
	import java.awt.Graphics;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.awt.event.MouseEvent;
	import java.awt.event.MouseListener;

	import javax.swing.JPanel;
	import javax.swing.Timer;


	public class Daire extends JPanel implements ActionListener,MouseListener {
        DaireCiz Cember [];
		int DaireMevcut;
		int DaireMax;
		
		
		int more=5;
		
		public Daire(){
			super();
			addMouseListener(this);
   		   Timer time = new Timer(100,this);
		    time.start();
		} 
		public void paintComponent (Graphics g){//daire çiz
			
			super.paintComponent(g);
	        Cember = new DaireCiz [DaireMevcut]; 
			for (int i = 0; i < DaireMevcut; i++) {
				Cember[i].daireYap(g);
			}
   			
 			
		}
		@Override
		public void actionPerformed(ActionEvent e) {//timer için
			for (int i = 0; i < DaireMevcut; i++) {
				Cember[i].genisle(i);
			}
			repaint();
		}
		@Override
		public void mouseClicked(MouseEvent e) {
			if(DaireMevcut <= DaireMax){
			DaireCiz BenimCemberim = new DaireCiz(e.getX(), e.getY(), 0);
			Cember[DaireMevcut]=BenimCemberim;
		    DaireMevcut++;
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

	
	

