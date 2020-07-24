package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClickerMaker implements ActionListener {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();

	void makeButtons() {
		button1.setText("Joke");
		button2.setText("Punchline");
		frame.setSize(500, 250);
		panel.add(button1);
		panel.add(button2);
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		button1.addActionListener(this);
		button2.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getSource() == (button1)) {
JOptionPane.showMessageDialog(null, "What do you call an aligator in a vest?");
		}
		if(arg0.getSource()==(button2)) {
			JOptionPane.showMessageDialog(null, "a very angry aligator");
		}
	}
}
