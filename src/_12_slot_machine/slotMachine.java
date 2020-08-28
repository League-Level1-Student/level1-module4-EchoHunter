package _12_slot_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class slotMachine implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JTextArea winnings = new JTextArea();
	Random r = new Random();
	int money=0;

	void run() throws MalformedURLException {
		button.setText("spin!");
		panel.add(button);
		panel.add(winnings);
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		button.addActionListener(this);
	}

	private JLabel createLabelImage(String fileName) throws MalformedURLException {
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null) {
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		String panel1 = null;
		String panel2 = null;
		String panel3 = null;
		for (int i = 0; i < 3; i++) {

			if (r.nextInt(3) == (0)) {
				try {
					panel.add(createLabelImage("lime.png"));
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if (i == (1)) {
					panel1 = ("lime");
				}
				if (i == (2)) {
					panel2 = ("lime");
				}
				if (i == (3)) {
					panel3 = ("lime");
				}
			} else if (r.nextInt(3) == (1)) {
				try {
					panel.add(createLabelImage("cherri.png"));
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if (i == (1)) {
					panel1 = ("cherri");
				}
				if (i == (2)) {
					panel2 = ("cherri");
				}
				if (i == (3)) {
					panel3 = ("cherri");
				}
			} else if (r.nextInt(3) == (2)) {
				try {
					panel.add(createLabelImage("oran.png"));
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if (i == (1)) {
					panel1 = ("oran");
				}
				if (i == (2)) {
					panel2 = ("oran");
				}
				if (i == (3)) {
					panel3 = ("oran");
				}
			}

		}
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		if ((panel1.equals(panel2)) && (panel2.equals(panel3))) {
			JOptionPane.showMessageDialog(null, "CONGRATS! You Won!");
			if (panel1.equals("lime")) {
				JOptionPane.showMessageDialog(null, "Only minor Winnings");
			money=money+5;
			winnings.setText("$"+money);
			}
			if (panel1.equals("oran")) {
				JOptionPane.showMessageDialog(null, "Good Winnings! congrats!");
			money=money+10;
			winnings.setText("$"+money);
			}
			if (panel1.equals("cherri")) {
				JOptionPane.showMessageDialog(null, "MAJOR Winnings! MY GOODNESS did you do well!");
			money=money+15;
			winnings.setText("$"+money);
			}
		}
		else{
			JOptionPane.showMessageDialog(null, "ooooooooh, better luck next time, buddy");
		}
		panel.removeAll();
		panel.add(button);
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
	}
}
