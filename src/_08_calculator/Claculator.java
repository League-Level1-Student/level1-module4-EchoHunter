package _08_calculator;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Claculator implements ActionListener {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JTextField text1 = new JTextField(15);
JTextField text2 = new JTextField(15);
JButton buttonAdd = new JButton();
JButton buttonSub = new JButton();
JButton buttonMult = new JButton();
JButton buttonDiv = new JButton();


public void run() {
	frame.setSize(1000,1000);
	panel.setPreferredSize(new Dimension(400,250));
	panel.add(text1);
	panel.add(text2);
	panel.add(buttonAdd);
	panel.add(buttonSub);
	panel.add(buttonMult);
	panel.add(buttonDiv);
	frame.add(panel);
	frame.pack();
	frame.setVisible(true);
buttonAdd.setText("add");
buttonSub.setText("sub");
buttonMult.setText("mul");
buttonDiv.setText("div");
buttonDiv.addActionListener(this);
buttonAdd.addActionListener(this);
buttonSub.addActionListener(this);
buttonMult.addActionListener(this);
}


@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	if (arg0.getSource()==(buttonAdd)) {
		String left =text1.getText();
		String right = text2.getText();
		
		double numL = Double.parseDouble(left);
		double numr = Double.parseDouble(right);
		numL=numL+numr;
		JOptionPane.showMessageDialog(null, numL);
	}
	else if (arg0.getSource()==(buttonSub)) {
		String left =text1.getText();
		String right = text2.getText();
		
		double numL = Double.parseDouble(left);
		double numr = Double.parseDouble(right);
		numL=numL-numr;
		JOptionPane.showMessageDialog(null, numL);
	}
	if (arg0.getSource()==(buttonMult)) {
		String left =text1.getText();
		String right = text2.getText();
		
		double numL = Double.parseDouble(left);
		double numr = Double.parseDouble(right);
		numL=numL*numr;
		JOptionPane.showMessageDialog(null, numL);
	}
	if (arg0.getSource()==(buttonDiv)) {
		String left =text1.getText();
		String right = text2.getText();
		
		double numL = Double.parseDouble(left);
		double numr = Double.parseDouble(right);
		numL=numL/numr;
		JOptionPane.showMessageDialog(null, numL);
	}
}
}
