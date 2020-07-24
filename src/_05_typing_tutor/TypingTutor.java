package _05_typing_tutor;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	
	char currentLetter;
	String letterNow;
	void gameBuilder() {
		frame.setSize(800, 500);
		frame.setTitle("Type or Else");
		label.setFont(label.getFont().deriveFont(64.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		currentLetter = generateRandomLetter();
		
		letterNow = String.valueOf(currentLetter);
		label.setText(letterNow);
		panel.add(label);
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		frame.addKeyListener(this);
	}

	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		int numberCorrect = 0;
		int lettersTyped = 0;
		lettersTyped++;
		if ((lettersTyped)==(30)) {
			frame.setVisible(false);
			JOptionPane.showMessageDialog(null, "You got "+ numberCorrect + "correct");
		}
		else {
		if (arg0.getKeyChar()==(currentLetter)) {
			panel.setBackground(Color.green);
		numberCorrect++;
		}
		else {
			panel.setBackground(Color.red);
		}
		currentLetter = generateRandomLetter();
		letterNow = String.valueOf(currentLetter);
		label.setText(letterNow);
		System.out.println("You Typed:"+ arg0.getKeyChar());
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
