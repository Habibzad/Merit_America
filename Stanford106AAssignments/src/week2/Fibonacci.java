package week2;

import acm.program.*;

public class Fibonacci extends ConsoleProgram {

	int term = 0;
	public void run() {
		while(term < 10) {
			System.out.println(term);
			term++;
		}
	}
}
