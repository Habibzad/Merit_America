package week4;

import java.io.BufferedReader;
import java.io.IOException;
import acm.program.ConsoleProgram;
import acm.util.ErrorException;
import acmx.export.java.io.FileReader;

public class Histograms extends ConsoleProgram {

	private int[] histogramArray;
	private String fileName = "C:\\Users\\ahmad\\Desktop\\scores.txt";
	private String line;
	BufferedReader bufferedReader;
	FileReader fileReader;

	public void run() {
		initHistogram();
		readScoresIntoHistogram();
		printHistogram();
	}

	private void initHistogram() {
		histogramArray = new int[11]; // Number of ranges
		// Set the ranges to 0
		for (int i = 0; i <= 10; i++) {
			histogramArray[i] = 0;
		}
	}

	private void readScoresIntoHistogram() {
		try {
			fileReader = new FileReader(fileName);
			bufferedReader = new BufferedReader(fileReader);
			while (true) {
				line = bufferedReader.readLine();
				if (line == null)
					break;
				int score = Integer.parseInt(line);
				if (score < 0 || score > 100) {
					throw new ErrorException("Score is out of range");
				} else {
					int range = score / 10;
					histogramArray[range]++;
				}
			}
		} catch (IOException ex) {
			throw new ErrorException(ex);
		}
	}

	private void printHistogram() {
		for (int range = 0; range <= 10; range++) {
			String label;
			switch (range) {
				case 0:
					label = "00-09";
					break;
				case 10:
					label = " 100";
					break;
				default:
					label = (10 * range) + "-" + (10 * range + 9);
					break;
			}
			String stars = createStars(histogramArray[range]);
			println(label + ": " + stars);
		}
	}

	private String createStars(int n) {
		String stars = "";
		for (int i = 0; i < n; i++) {
			stars += "*";
		}
		return stars;
	}

}
