package day3;

import javax.swing.JOptionPane;

public class Greeter {
	public static void main(String[] args) {
	String name= JOptionPane.showInputDialog("Please Enter your Name");
	JOptionPane.showMessageDialog(null,"Hello "+name);
	String adjective= JOptionPane.showInputDialog("Please Enter an Adjective");
	
	}

}
