package week1;
import stanford.karel.*;

public class KarelDefendsDemocracy extends SuperKarel {

	public void run() {
		move();
		while(!frontIsBlocked()) {
			checkBeeper();
			moveAhead();
		}
	}
	
	void checkBeeper() {
		if(!beepersPresent()) {
			collectBeepers();
		}
	}
	
	void collectBeepers() {
		turnLeft();
		move();
		pickBeepers();
		turnAround();
		moveAhead();
		pickBeepers();
		turnAround();
		move();
		turnRight();
	}
	
	//Check if Karl the robot is not at the end of punch-card ballot
	private void moveAhead() {
		move();
		if(!frontIsBlocked()) {
			move();
		}
	}
	
	private void pickBeepers() {
		while(beepersPresent()) {
			pickBeeper();
		}
	}
}
