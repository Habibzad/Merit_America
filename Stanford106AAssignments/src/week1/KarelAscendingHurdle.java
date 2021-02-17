package week1;
import stanford.karel.*;
@SuppressWarnings("serial")
public class KarelAscendingHurdle extends SuperKarel{
	public void run() {
		for(int i = 1; i<15; i++) {
			if(frontIsClear()) {
				move();
			}
			else {
				jumpHurdle();
			}
		}
	}
	
	private void jumpHurdle() {
		ascendHurdle();
		move();
		descendHurdle();
	}
	
	private void ascendHurdle() {
		turnLeft();
		while(rightIsBlocked()) {
			move();
		}
		turnRight();
	}
	
	private void descendHurdle() {
		turnRight();
		while(frontIsClear()) {
			move();
		}
		turnLeft();
	}
}
