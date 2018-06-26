package section2;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		// 1. Create a new Robot
Robot sandy = new Robot ();		
		// 5. Set your robot's pen down 
sandy.penDown();	
		// 3. Set the robot to go at max speed (100)
sandy.setSpeed(100);		
		// 4. Use a for loop to repeat steps #7 to #8, 75 times
for (int x=0; x<75; x++)	{	
			// 7. Change the pen color to random
sandy.setRandomPenColor();		
			// 6. Move the robot 5 times the loop counter (5*i)
sandy.move(5*x);			
			// 2. Turn the robot 360/7 degrees to the right
sandy.turn(360/7);		
			// 8. Set the pen width to i
sandy.setPenWidth(x);}			
	}
}
