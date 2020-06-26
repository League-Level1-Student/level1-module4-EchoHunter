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

public class NastySupriseWindow implements ActionListener {
	 JFrame frame = new JFrame();
	 JPanel panel = new JPanel();
	 JLabel trickText= new JLabel();
	 JLabel treatText= new JLabel();
	 JButton trick = new JButton();
	 JButton treat = new JButton();
	void makeWindow() {
		
		 trickText.setText("Trick?");
		 treatText.setText("Treat?");
		 trick.add(trickText);
		 treat.add(treatText);
		 panel.add(trick);
		 panel.add(treat);
		 frame.add(panel);
		 frame.setVisible(true);
		 frame.pack();
		 trick.addActionListener(this);
		 treat.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getSource().equals(trick)) {
			showPictureFromTheInternet("https://photos.puppyspot.com/1/listing/625401/photo/5316865_large-resize.jpg");
		}
		else if(arg0.getSource().equals(treat)) {
			showPictureFromTheInternet("https://media.tenor.com/images/35eaa865673fb96ad93ead542958ec84/tenor.gif");
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
