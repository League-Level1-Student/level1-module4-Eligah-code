package _01_nasty_surprise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Nastysuprise implements ActionListener {
	JPanel idea= new JPanel ();
	JLabel box = new JLabel("TrickorTreat");
	JFrame the = new JFrame();
	JButton hive = new JButton("Trick");
	JButton Bee = new JButton("Treat");

	Nastysuprise() {
		the.add(idea);
		idea.add(box);
		the.setVisible(true);
		
		hive.addActionListener(this);
		Bee.addActionListener(this);
		
	
		idea.add(hive);
		idea.add(Bee);
		the.pack();
	}

	public static void main(String[] args) {
		Nastysuprise joint = new Nastysuprise ();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(hive==e.getSource()) {
			showPictureFromTheInternet("https://www.allthingsdogs.com/wp-content/uploads/2019/05/Cute-Puppy-Names.jpg");	
		}
		if(Bee==e.getSource()) {
			showPictureFromTheInternet("https://images.complex.com/complex/images/c_limit,dpr_auto,q_90,w_720/fl_lossy,pg_1/mwcwdmqmnnpzjyaczxvi/scream");
		}
		
	}
	private void showPictureFromTheInternet(String imageUrl) {
	    try {
	        URL url = new URL(imageUrl);
	        Icon icon = new ImageIcon(url);
	        JLabel imageLabel = new JLabel(icon);
	        JFrame frame = new JFrame();
	        frame.add(imageLabel);
	        frame.setVisible(true);
	        frame.pack();
	    } catch (MalformedURLException e) {
	        e.printStackTrace();
	    }
	}

}
