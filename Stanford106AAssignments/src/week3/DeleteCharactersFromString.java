package week3;

import acm.program.ConsoleProgram;

public class DeleteCharactersFromString extends ConsoleProgram {
	
	public void run() {
		String test1 = removeAllOccurrences("This is a test", 't');
		String test2 = removeAllOccurrences("Summer is here!", 'e');
		println(test1);
		println(test2);
	}
	
	private String removeAllOccurrences(String str, char ch) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ch) {
				result += str.charAt(i);
			}
		}
		return result;
	}
}
