package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
Robot sandy = new Robot();	
sandy.setSpeed(250);
sandy.penDown();
sandy.move(100);		
sandy.turn(90);
sandy.move(100);	
sandy.miniaturize();
for (int x=0; x<2;x++) {
sandy.turn(90);
sandy.move(100);}	
sandy.sparkle();
sandy.setPenColor(Color.CYAN);
for (int x=0; x<4;x++) {
sandy.turn(90);
sandy.move(100);}

	}
}
