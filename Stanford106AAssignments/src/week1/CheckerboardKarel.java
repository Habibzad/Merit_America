package week1;
/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * When you finish writing it, the CheckerboardKarel class should draw
 * a checkerboard using beepers, as described in Assignment 1.  You
 * should make sure that your program works for all of the sample
 * worlds supplied in the starter folder.
 */

import stanford.karel.*;

public class CheckerboardKarel extends SuperKarel {
	private static int count = 0;
	public void run() {
		while(true) {
			puttingChekers();
			turn();
		}
	}
	
	private void puttingChekers() {
		while(frontIsClear()) {
			if(count%2==0) {
				putBeeper();
			}
			count++;
			move();
		}
		if(count%2==0) {
			putBeeper();
		}
		count++;
	}
	
	private void turn() {
		if(facingEast()) {
			turnLeft();
			move();
			turnLeft();
		} else if( facingWest()) {
			turnRight();
			move();
			turnRight();
		}
	}
}
