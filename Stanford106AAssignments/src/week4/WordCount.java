package week4;

import java.io.BufferedReader;
import java.io.IOException;
import acm.program.ConsoleProgram;
import acmx.export.java.io.FileReader;

public class WordCount extends ConsoleProgram {
	int lineCounter = 0;
	int wordCounter = 0;
	int charCounter = 0;

	public void run() {

		BufferedReader bufferedReader;
		FileReader fileReader;
		String line;
		String fileName = "C:\\Users\\ahmad\\Desktop\\test.txt";

		try {
			fileReader = new FileReader(fileName);
			bufferedReader = new BufferedReader(fileReader);
			while (true) {
				line = bufferedReader.readLine();
				if (line == null)
					break;
				lineCounter++;
				wordCounter += countWords(line);
				charCounter += line.length();
			}
			bufferedReader.close();
		} catch (IOException ex) {
			println("An I/O exception has occurred");
		}
		println("File  = " + fileName);
		println("Lines = " + lineCounter);
		println("Words = " + wordCounter);
		println("Chars = " + charCounter);
	}

	// Words Count Method
	private int countWords(String line) {
		int totalWords = 0;
		for (int i = 0; i < line.length(); i++) {
			char ch = line.charAt(i);
			if (Character.isLetterOrDigit(ch)) {
				totalWords++;
			}
		}
		return totalWords;
	}

}
