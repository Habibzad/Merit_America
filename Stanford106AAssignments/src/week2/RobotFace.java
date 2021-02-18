package week2;

import java.awt.Color;

import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;
/**
 * This class draws a robot face
 * @author ahmad
 *
 */
public class RobotFace extends GraphicsProgram {
	
	// Parameters 
	private static final int HEAD_WIDTH = 300;
	private static final int HEAD_HEIGHT = 400;
	private static final int EYE_RADIUS = 30;
	private static final int MOUTH_WIDTH = 180;
	private static final int MOUTH_HEIGHT = 60;
	
	public void run() {
		final double x = getWidth() / 2;
		final double y = getHeight() / 2;
		addRobotFace(x, y);
	}
	
	private void addRobotFace(double x, double y) {
		addHead(x, y);
		addEye(x - HEAD_WIDTH * 0.25, y - HEAD_HEIGHT * 0.25);
		addEye(x + HEAD_WIDTH * 0.25, y - HEAD_HEIGHT * 0.25);
		addMouth(x, y + HEAD_HEIGHT / 4);
	}
	
	//Add Head Method
	private void addHead(double x, double y) {
		double a = x - HEAD_WIDTH * 0.5;
		double b = y - HEAD_HEIGHT * 0.5;
		GRect head = new GRect(a, b, HEAD_WIDTH, HEAD_HEIGHT);
		head.setFilled(true);
		head.setFillColor(Color.gray);
		add(head);
	}
	
	//Add Eye Method
	private void addEye(double x, double y) {
		double a = x - EYE_RADIUS;
		double b = y - EYE_RADIUS;
		GOval eye = new GOval(a, b, 2 * EYE_RADIUS, 2 * EYE_RADIUS);
		eye.setFilled(true);
		eye.setColor(Color.YELLOW);
		add(eye);
	}
	
	//Add Mouth Method
	private void addMouth(double x, double y) {
		double a = x - MOUTH_WIDTH * 0.5;
		double b = y - MOUTH_HEIGHT * 0.5;
		GRect mouth = new GRect(a, b, MOUTH_WIDTH, MOUTH_HEIGHT);
		mouth.setFilled(true);
		mouth.setColor(Color.WHITE);
		add(mouth);	
	}
	
	
}
