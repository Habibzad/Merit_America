package week3;

import acm.program.ConsoleProgram;
/**
 * This program adds commas to numeric strings 
 * to separate the digits into groups of three. 
 * For example, 1000000 ==> 1,000,000
 * @author Ahmad
 *
 */
public class AddCommasToNumberStrings extends ConsoleProgram {
	
	public void run() {
		while (true) {
			 String digits = readLine("Enter a numeric string: ");
			 if (digits.length() == 0) break;
			 println(addCommasToNumericString(digits));
			 }

	}
	
	//Method implementation
	private String addCommasToNumericString(String digits) {
		String commaSeparatedDigits = "";
		int counter = 0;
		int digitsLength = digits.length();
		
		for(int i = digitsLength-1; i>=0; i--) {
			commaSeparatedDigits = digits.charAt(i) + commaSeparatedDigits;
			counter++;
			if (((counter % 3)== 0) && (i > 0)) {
				commaSeparatedDigits ="," + commaSeparatedDigits;
			}
		}
		return commaSeparatedDigits;
	}
	
}
