package _11_whack_a_mole;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.sun.media.jfxmedia.AudioClip;

public class whack_mole implements ActionListener, MouseListener {
	int score = 0;
	int missed = 0;
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton button1 = new JButton();
JButton button2 = new JButton();
JButton button3 = new JButton();
JButton button4 = new JButton();
JButton button5 = new JButton();
JButton button6 = new JButton();
JButton button7 = new JButton();
JButton button8 = new JButton();
JButton button9 = new JButton();
JButton button10 = new JButton();
JButton button11 = new JButton();
JButton button12 = new JButton();
JButton button13 = new JButton();
JButton button14 = new JButton();
JButton button15 = new JButton();
JButton button16 = new JButton();
JButton button17 = new JButton();
JButton button18 = new JButton();
JButton button19 = new JButton();
JButton button20 = new JButton();
JButton button21 = new JButton();
JButton button22 = new JButton();
JButton button23 = new JButton();
JButton button24 = new JButton();
JButton button25 = new JButton();
JButton button26 = new JButton();
JButton button27 = new JButton();
JButton button28 = new JButton();
JButton button29 = new JButton();
JButton button30 = new JButton();

	public void run() {
	drawButtons();
	panel.add(button1);
	panel.add(button2);
	panel.add(button3);
	panel.add(button4);
	panel.add(button5);
	panel.add(button6);
	panel.add(button7);
	panel.add(button8);
	panel.add(button9);
	panel.add(button10);
	panel.add(button11);
	panel.add(button12);
	panel.add(button13);
	panel.add(button14);
	panel.add(button15);
	panel.add(button16);
	panel.add(button17);
	panel.add(button18);
	panel.add(button19);
	panel.add(button20);
	panel.add(button21);
	panel.add(button22);
	panel.add(button23);
	panel.add(button24);
	panel.add(button25);
	panel.add(button26);
	panel.add(button27);
	panel.add(button28);
	panel.add(button29);
	panel.add(button30);
	frame.add(panel);
	frame.setSize(300,150);
	frame.setVisible(true);
	frame.addMouseListener(this);
}
	private void drawButtons() {
		Random r = new Random();
		int num = r.nextInt(30);
		if(num == 0) {
			button30.setText("mole");
			button30.addActionListener(this);
		}
		else if(num == 1) {
			button1.setText("mole");
			button1.addActionListener(this);
		}
		else if(num == 2) {
			button2.setText("mole");
			button2.addActionListener(this);
		}
		else if(num == 3) {
			button3.setText("mole");
			button3.addActionListener(this);
		}
		else if(num == 4) {
			button4.setText("mole");
			button4.addActionListener(this);
		}
		else if(num == 5) {
			button5.setText("mole");
			button5.addActionListener(this);
		}
		else if(num == 6) {
			button6.setText("mole");
			button6.addActionListener(this);
		}
		else if(num == 7) {
			button7.setText("mole");
			button7.addActionListener(this);
		}
		else if(num == 8) {
			button8.setText("mole");
			button8.addActionListener(this);
		}
		else if(num == 9) {
			button9.setText("mole");
			button9.addActionListener(this);
		}
		else if(num == 10) {
			button10.setText("mole");
			button10.addActionListener(this);
		}
		else if(num == 11) {
			button11.setText("mole");
			button11.addActionListener(this);
		}
		else if(num == 12) {
			button12.setText("mole");
			button12.addActionListener(this);
		}else if(num == 13) {
			
			button13.setText("mole");
			button13.addActionListener(this);
		}else if(num == 14) {
			button14.setText("mole");
			button14.addActionListener(this);
		}else if(num == 15) {
			button15.setText("mole");
			button15.addActionListener(this);
		}
		else if(num == 16) {
			button16.setText("mole");
			button16.addActionListener(this);
		}else if(num == 17) {
			button17.setText("mole");
			button17.addActionListener(this);
		}else if(num == 18) {
			button18.setText("mole");
			button18.addActionListener(this);
		}else if(num == 19) {
			button19.setText("mole");
			button19.addActionListener(this);
		}else if(num == 20) {
			button20.setText("mole");
			button20.addActionListener(this);
		}else if(num == 21) {
			button21.setText("mole");
			button21.addActionListener(this);
		}else if(num == 22) {
			button22.setText("mole");
			button22.addActionListener(this);
		}else if(num == 23) {
			button23.setText("mole");
			button23.addActionListener(this);
		}else if(num == 24) {
			button24.setText("mole");
			button24.addActionListener(this);
		}else if(num == 25) {
			button25.setText("mole");
			button25.addActionListener(this);
		}else if(num == 26) {
			button26.setText("mole");
			button26.addActionListener(this);
		}else if(num == 27) {
			button27.setText("mole");
			button27.addActionListener(this);
		}else if(num == 28) {
			button28.setText("mole");
			button28.addActionListener(this);
		}else if(num == 29) {
			button29.setText("mole");
			button29.addActionListener(this);
		}
		missed--;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		score++;
		button1.removeActionListener(null);
		button2.removeActionListener(null);
		button3.removeActionListener(null);
		button4.removeActionListener(null);
		button5.removeActionListener(null);
		button6.removeActionListener(null);
		button7.removeActionListener(null);
		button8.removeActionListener(null);
		button9.removeActionListener(null);
		button10.removeActionListener(null);
		button11.removeActionListener(null);
		button12.removeActionListener(null);
		button13.removeActionListener(null);
		button14.removeActionListener(null);
		button15.removeActionListener(null);
		button16.removeActionListener(null);
		button17.removeActionListener(null);
		button18.removeActionListener(null);
		button19.removeActionListener(null);
		button20.removeActionListener(null);
		button21.removeActionListener(null);
		button22.removeActionListener(null);
		button23.removeActionListener(null);
		button24.removeActionListener(null);
		button25.removeActionListener(null);
		button26.removeActionListener(null);
		button27.removeActionListener(null);
		button28.removeActionListener(null);
		button29.removeActionListener(null);
		button30.removeActionListener(null);
		button1.setText("");
		button2.setText("");
		button3.setText("");
		button4.setText("");
		button5.setText("");
		button6.setText("");
		button7.setText("");
		button8.setText("");
		button9.setText("");
		button10.setText("");
		button11.setText("");
		button12.setText("");
		button13.setText("");
		button14.setText("");
		button15.setText("");
		button16.setText("");
		button17.setText("");
		button18.setText("");
		button19.setText("");
		button20.setText("");
		button21.setText("");
		button22.setText("");
		button23.setText("");
		button24.setText("");
		button26.setText("");
		button27.setText("");
		button28.setText("");
		button29.setText("");
		button30.setText("");
		drawButtons();
		playSound("creepy-noise.wav");
		if (score == (10)) {
			endGame(10);
		}
	}
	private void endGame( int molesWhacked) { 
	    
	    JOptionPane.showMessageDialog(null, "You whacked "+ molesWhacked +" moles.");
	}
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		missed++;
		if(missed == (1)) {
			speak("it's ok, you'll do better next time");
		}
		if (missed == (2)) {
			speak("hey man, try to be more accurate");
			
		}
		else if (missed == (3)) {
			speak("ok, you've gotta be kidding");
		}
		else if (missed == (4)) {
			speak("really bro, whats wrong with you?");
		}
		else if(missed==(5)) {
			speak("ok that's it, you are done now");
			endGame(score);
			
		}
	}
	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	private void playSound(String fileName) { 
	    AudioClip sound = (AudioClip) JApplet.newAudioClip(getClass().getResource(fileName));
	    sound.play();
	}
	static void speak(String words) {
        if( System.getProperty( "os.name" ).contains( "Windows" ) ) {
            String cmd = "PowerShell -Command \"Add-Type -AssemblyName System.Speech; (New-Object System.Speech.Synthesis.SpeechSynthesizer).Speak('"
                    + words + "');\"";
            try {
                Runtime.getRuntime().exec( cmd ).waitFor();
            } catch( Exception e ) {
                e.printStackTrace();
            }
        } else {
            try {
                Runtime.getRuntime().exec( "say " + words ).waitFor();
            } catch( Exception e ) {
                e.printStackTrace();
            }
        }
    }
}
