package week2;

import java.awt.Color;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;
/**
 * This program generates 10 random circles with random sizes and colors each time it is executed
 * @author Ahmad
 *
 */
public class RandomCircles extends GraphicsProgram {
	//Total number of circles in the canvas
	 private static final int NUM_OF_CIRCLES = 10;
	// Minimum radius of the circle
	 private static final double MIN_RADIUS = 5;
	// Maximum radius of the circle/
	 private static final double MAX_RADIUS = 50;
	 
	public void run() {
		
		for(int i = 0; i<NUM_OF_CIRCLES; i++) {
			double r = random.nextDouble(MIN_RADIUS, MAX_RADIUS);
			double x = random.nextDouble(0, getWidth() - 2 * r);
			double y = random.nextDouble(0, getHeight() - 2 * r);
			GOval circle = filledCircle(x, y, r, random.nextColor());
			add(circle);
			
		}
				
	}
	/**
	 * 
	 * @param x passed by the random generator
	 * @param y passed by the random generator
	 * @param r passed by the random generator
	 * @param color passed by the random generator
	 * @return returns a circle with a random size, position, and color
	 */
	private GOval filledCircle(double x, double y, double r, Color color) {
		GOval circle = new GOval(x, y, 2*r, 2*r);
		circle.setFilled(true);
		circle.setFillColor(color);
		return circle;
	}
	
	//Private instance variable
	private RandomGenerator random = RandomGenerator.getInstance();
	
}
