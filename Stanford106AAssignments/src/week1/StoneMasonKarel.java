package week1;
/*
 * File: StoneMasonKarel.java
 * --------------------------
 * The StoneMasonKarel subclass as it appears here does nothing.
 * When you finish writing it, it should solve the "repair the quad"
 * problem from Assignment 1.  In addition to editing the program,
 * you should be sure to edit this comment so that it no longer
 * indicates that the program does nothing.
 */

import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {

	public void run() {
		while(!frontIsBlocked()) {
			repairDone();
			moveToNextDone();
		}
		if(frontIsBlocked()) {
			repairDone();
		}
	}
	
	private void repairDone() {
		turnLeft();
		moveForward();
		turnAround();
		moveForward();
		turnLeft();
	}
	
	private void moveForward() {
		if(!beepersPresent()) {
			putBeeper();
		}
		while(!frontIsBlocked()) {
			if(!beepersPresent()) {
				putBeeper();
			}
			move();
		}
	}
	
	private void moveToNextDone() {
		for(int i = 0; i<4; i++) {
			move();
		}
	}

}
