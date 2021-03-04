package week4;

import java.io.BufferedReader;
import java.io.IOException;
import acm.program.ConsoleProgram;
import acm.util.ErrorException;
import acmx.export.java.io.FileReader;

public class Histograms extends ConsoleProgram {

	private int histogramArray[];
	BufferedReader bufferedReader;
	FileReader fileReader;
	String line;
	String fileName = "C:\\Users\\ahmad\\Desktop\\scores.txt";

	public void run() {
		// Initialize array
		histogramArray = new int[11];
		for (int i = 0; i < 10; i++) {
			histogramArray[i] = 0;
		}

		// Create BufferReader and read the lines
		try {
			fileReader = new FileReader(fileName);
			bufferedReader = new BufferedReader(fileReader);
			while (true) {
				line = bufferedReader.readLine();
				if (line == null) {
					break;
				}
				int score = Integer.parseInt(line);
				if (score < 0 || score > 100) {
					throw new Exception("Score out of range");
				} else {
					int range = score / 10;
					histogramArray[range]++;
				}

			}
		} catch (Exception e) {
			println("eception occured" + e);
		}

		// Print the histogram
		for (int range = 0; range < 10; range++) {
			String label;
			switch (range) {
				case 0:
					label = "00-09";
					break;
				case 100:
					label = "100";
					break;
				default:
					label = (range * 10) + "-" + (range * 10 + 9);
					break;
			}
			String stars = createStars(histogramArray[range]);
			println(label + ": " + stars);
		}

	}

	private String createStars(int range) {
		String stars = "";
		for (int i = 0; i < range; i++) {
			stars += "*";
		}
		return stars;
	}

}
