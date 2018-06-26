package section2;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class FlamingNinjaStar {
	
	public static void main(String[] args) {

		int baseSize = 300;		//the size of the black part of the star
		int flameSize = 200;		//the length of the flaming arms
		
		// 1. Make a new robot, and set it's pen down.
Robot sandy = new Robot();
sandy.penDown();
sandy.setSpeed(500);
		// *14. Use the methods setX and setY to move the ninja star into the center of the screen
sandy.setX(500);
sandy.setY(500);
// *15. Make some adjustments to see what other kinds of shapes you can make.

		// 12. Set the robot speed to 10
sandy.setSpeed(10);
		// 13. Use a for loop to repeat all of the code below 25 times
for (int x=0; x<25; x++){
			// 2. Turn the robot 1/8 of a circle
sandy.turn(360/8);
		
			// 3. Move the robot 64 pixels
sandy.move(64);
			// 4. Turn the robot 40 degrees to the LEFT. (Negative numbers will turn the robot counter-clockwise.)
sandy.setPenColor(Color.YELLOW);	
sandy.turn(-40);			
			// 5. Move the robot the distance in the variable flameSize
sandy.move(flameSize);			
			// 6. Turn the robot 170 degrees
sandy.turn(170);			
			// 7. Move the robot the distance in the variable flameSize (again)	
sandy.move(flameSize);	
sandy.setPenColor(Color.BLACK);
			// 8. Turn the robot 64 degrees to the right
sandy.turn(64);			
			// 9. Move the robot the distance in the variable baseSize
sandy.move(baseSize);		
			// 10. Check that your shape is the same as Figure 1. This is one arm of the ninja star.
			
			// 11. Color your ninja star like Figure 2.
sandy.setPenColor(Color.YELLOW);	}	
	}

}


