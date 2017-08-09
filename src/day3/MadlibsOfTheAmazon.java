package day3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	public static void main(String[] args) {

		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to do it...

		// Get the user to enter an adjective
		String adjective= JOptionPane.showInputDialog("Please Enter an Adjective");
		// Get the user to enter a type of liquid
		String liquid= JOptionPane.showInputDialog("Please Enter a Liguid");
		// Get the user to enter a body part
		String body_part= JOptionPane.showInputDialog("Please Enter a Body Part");
		// Get the user to enter a verb
		String verb= JOptionPane.showInputDialog("Please Enter a Verb");
		// Get the user to enter a place
		String place= JOptionPane.showInputDialog("Please Enter a Place");
		// Fit the user's words into this sentence, and save it in a String:
		String sentence= "Piranhas are more " +adjective + " during the day, so cross the river at night."
		 + "Piranhas are attracted to fresh " +liquid+ " \n and will most likely take a bite out of your " +body_part+ " if you " +verb+ "." +
		 "\n Whatever you do, if you have an open wound, try to \n find another way to get back to the " +place+ ". Good luck!";
		JOptionPane.showMessageDialog(null,sentence);
		
		// Make a pop-up for the final story. You can use \n to go to the next line.
		

	}
}

