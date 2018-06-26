package section2;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;



public class TriangleShell {

	// 1. Create a new Robot
Robot sandy = new Robot();
	void go() {
		//drawTriangle(100); // 3. delete this line (used only for testing)

		// 6. Make the robot go as fast as possible
sandy.setSpeed(500);
sandy.penDown();
		// 4. make a variable to hold the length of the triangle and set it to 50
int length = 50;
		// 7. Use a for loop to repeat steps #9 to #10, 60 times
for (int x=0; x<60; x++) {
			// 9. Change the color of the pen to a random color

sandy.setPenColor(Color.WHITE);	
			// 8. Increase the length variable by 10
length += 10;
			// 5. call your drawTriangle() method using your length variable
drawTriangle(length)	;
			// 10. Turn the robot 6 degrees to the right
sandy.turn(6);}

	}

	/* 2. fill in the method below to draw a triangle. Use the length variable when you call move(). */
	private void drawTriangle(int length) {
for (int x=0; x<3; x++) {
sandy.move(length);		
sandy.turn(360/3);	}
		
	}

	
	public static void main(String[] args) {
		new TriangleShell().go();
	}
}