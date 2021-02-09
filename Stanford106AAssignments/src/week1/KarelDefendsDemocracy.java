package week1;
import stanford.karel.*;

public class KarelDefendsDemocracy extends SuperKarel {

	public void run() {
		move();
		checkBeeper();	
	}
	
	void checkBeeper() {
		if(beepersPresent()) {
			moveAhead();
		}
		else {
			collectBeepers();
		}
	}
	
	void collectBeepers() {
		turnLeft();
		move();
		while(beepersPresent()) {
			pickBeeper();
		}
		turnAround();
		move();
		move();
		while(beepersPresent()) {
			pickBeeper();
		}
		turnAround();
		move();
		turnRight();
		moveAhead();
		checkBeeper();
	}
	
	
	void moveAhead() {
		move();
		while(frontIsClear()) {
			move();
			checkBeeper();
		}
	}
	
		
}
