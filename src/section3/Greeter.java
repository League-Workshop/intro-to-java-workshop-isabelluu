package section3;

import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
	//JOptionPane.showInputDialog("What is your name?");
	String name = JOptionPane.showInputDialog("What is your name?");
			System.out.println(name);
			JOptionPane.showMessageDialog(null,"Hi " + name +", how are you today?" );
			System.out.println("Hi " + name +", how are you today?");
}
}
