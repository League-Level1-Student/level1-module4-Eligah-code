import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhackAMole 

{
	JFrame jud = new JFrame ();
	JPanel mole = new JPanel ();
	
	public static void main(String[] args) {
		
		
		WhackAMole Rat = new WhackAMole();
		
	}
WhackAMole() {
	
		jud.setVisible(true);
		
		jud.add(mole);
		drawButtons(30);
	
}
void drawButtons (int hole ) {
Random themole = new Random ();
int rando = themole.nextInt(hole);
for (int i = 0; i < hole; i++) {
JButton zapp = new JButton ();	

mole.add(zapp);
if(rando == i) {
zapp.setText("Dave");	
}
}

jud.pack();
	
}
}
