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
