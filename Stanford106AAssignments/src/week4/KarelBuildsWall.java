package week4;

import stanford.karel.*;

/*
 * File: KarelBuildsWall.java
 * ----------------------------
 *  Karel program which will create an inside border around the world. 
 *  Each location that is part of the border should have one (and only one) beeper on it 
 *  and the border should be inset by one square from the outer walls of the world
 */
public class KarelBuildsWall extends SuperKarel {
    public void run() {
        move();
        turnLeft();
        move();
        if (frontIsClear()) {
            turnRight();
        }
        putBeeperLine();
        putBeeperLine();
        putBeeperLine();
        putBeeperLine();
    }

    private void putBeeperLine() {
        while (frontIsClear()) {
            if (noBeepersPresent()) {
                putBeeper();
            }
            move();
        }
        turnAround();
        move();
        turnRight();
    }
}
