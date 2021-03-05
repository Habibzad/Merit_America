package week4;

/*
 *  This program puts a frog image on the screen and gets the frog to jump when the user clicks the mouse
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.event.*;

public class Frogger extends GraphicsProgram {
    public static final int SQSIZE = 75;
    public static final int NCOLS = 7;
    public static final int NROWS = 3;
    public static final int APPLICATION_WDITH = 525;
    public static final int APPLICATION_HEIGHT = 225;

    String frogPath = "C:\\Users\\ahmad\\Documents\\Code\\Java\\Stanford106AAssignments\\frog.png";
    /* Instance Variables */
    GImage frog;
    int mouseX;
    int mouseY;

    public void init() {
        addMouseListeners();
        addFrog();
    }

    public void run() {
        while (true) {
            waitForClick();
            moveFrog();
        }
    }

    private void addFrog() {
        frog = new GImage(frogPath);
        double x = getWidth() / 2 - frog.getWidth() / 2;
        double y = (getHeight() - frog.getHeight()) - (SQSIZE - frog.getHeight()) / 2;
        add(frog, x, y);
    }

    public void mouseMoved(MouseEvent e) {
        mouseX = e.getX();
        mouseY = e.getY();
    }

    private void moveFrog() {
        double frogX = frog.getX();
        double frogY = frog.getY();
        if (Math.abs(mouseY - frogY) > Math.abs(mouseX - frogX)) {
            if (mouseY - frogY < 0)
                frog.setLocation(frog.getX(), frog.getY() - SQSIZE); // move up
            if (mouseY - frogY > 0)
                frog.setLocation(frog.getX(), frog.getY() + SQSIZE); // move down
        }
        if (Math.abs(mouseX - frogX) > Math.abs(mouseY - frogY)) {
            if (mouseX - frogX < 0)
                frog.setLocation(frog.getX() - SQSIZE, frog.getY()); // move left
            if (mouseX - frogX > 0)
                frog.setLocation(frog.getX() + SQSIZE, frog.getY()); // move right
        }
    }

}