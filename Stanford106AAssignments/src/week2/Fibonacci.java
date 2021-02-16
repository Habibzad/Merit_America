package week2;

import acm.program.*;
import acm.graphics.*;

public class Fibonacci extends ConsoleProgram {
	//This will print the Fibonacci number
	
	private static int MAX_TERM_VALUE = 10000;
	
	public void run() {
		println("This program lists the Fibonacci sequence.");
		int num1 = 0;
		int num2 = 1;
		
		while(num1 < MAX_TERM_VALUE) {
			println(num1);
			int sum = num1+num2;
			num1 = num2;
			num2 = sum;
		}
	}
}
