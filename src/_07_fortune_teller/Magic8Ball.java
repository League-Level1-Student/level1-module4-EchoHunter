package _07_fortune_teller;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */


import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
public static void main(String[] args) {
	Random m = new Random();

	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
int num = m.nextInt(4);
	// 3. Print out this variable
System.out.println(num);
	// 4. Get the user to enter a question for the 8 ball
JOptionPane.showInputDialog("What is your (yes or no) question? I don't have all day.");
	// 5. If the random number is 0
if (num==(0)) {
	JOptionPane.showMessageDialog(null, "Yes, I Guess");
}
	// -- tell the user "Yes"

	// 6. If the random number is 1
else if(num == (1)) {
	JOptionPane.showMessageDialog(null, "nope");
}
	// -- tell the user "No"
else if(num == (2)) {
	// 7. If the random number is 2
JOptionPane.showMessageDialog(null,"ask someone else, why don't'cha?");
	// -- tell the user "Maybe you should ask Google?"
}
	// 8. If the random number is 3
else if (num == (3)) {
	JOptionPane.showMessageDialog(null,"aaaaaaaaaaand you're out of time, come back tomorrow");
}
	// -- write your own answer

}
}
