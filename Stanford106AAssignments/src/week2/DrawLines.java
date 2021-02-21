package week2;

import acm.graphics.*;
import acm.program.*;
import java.awt.event.*;

public class DrawLines extends GraphicsProgram {
	//This program will let users to draw lines on the canvas
	public void init() {
		addMouseListeners();
	}
	//Called on mouse press to draw a line 
	public void mousePressed(MouseEvent e) {
		line = new GLine(e.getX(), e.getY(), e.getX(), e.getY());
		add(line);
	}
	//Called on mouse drag to reset the end point
	public void mouseDragged(MouseEvent e) {
		line.setEndPoint(e.getX(), e.getY());
	}
	//private instance variable
	private GLine line;
	
}
