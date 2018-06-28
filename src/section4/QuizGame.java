package section4;

import javax.swing.JOptionPane;

public class QuizGame {

	private static final String String = null;

	public static void main(String[] args) {

		// 1. Create a variable to hold the user's score
		int score = 0;
		// 2. Ask the user a question
		String place = JOptionPane.showInputDialog("True or false. The ocean is my all time favorite place.");
		System.out.println(place);
		// 3. Use an if statement to check if their answer is correct
		if (place.equals("True")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score = score +1;
		} else {
			JOptionPane.showMessageDialog(null, "Incorrect");
			
		}
		// 4. if the user's answer is correct
		//if (place.equals("The ocean")) {
		//	score = +1;
		//} else {
		//	score = 0;
		//}
		// -- add one to their score

		// 5. Create more questions by repeating steps 1, 2, and 3 below.
		String vacation = JOptionPane.showInputDialog("I have never been outside of the country.");
		if (vacation.equals("False")) {
			JOptionPane.showMessageDialog(null, "Correct");
			score = score +1;
		} else {
			JOptionPane.showMessageDialog(null, "Incorrect");
			
		}
		String family = JOptionPane.showInputDialog("I have over 20 cousins.");
		if (family.equals("True")) {
			JOptionPane.showMessageDialog(null, "Correct");
			score +=1;
		} else {
			JOptionPane.showMessageDialog(null, "Incorrect");
		}
		// 6. After all the questions have been asked, print the user's score
JOptionPane.showMessageDialog(null, "You scored a " + score + "/3");
	}
}
