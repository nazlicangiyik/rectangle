import javax.swing.JFrame;

public class PencereDene {

	public static void main(String[] args) {
	
		JFrame pencere = new JFrame("my window"); 
		YeniPanel panel1=new YeniPanel();
		pencere.add(panel1);
		pencere.addKeyListener(panel1);//key listener'ý  eklemezsen kutu hiç hareket etmez.
		pencere.setSize(640, 480);
		pencere.setVisible(true);
	   
	}	

}
