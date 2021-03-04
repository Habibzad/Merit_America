package week4;

import java.util.ArrayList;

import acm.program.ConsoleProgram;

public class UniqueNames extends ConsoleProgram {

	public void run() {
		// Create list
		ArrayList<String> namesList = new ArrayList<String>();
		String name;

		while (true) {
			name = readLine("Enter a name: ");
			if (name.equals("")) {
				break;
			}

			if (!namesList.contains(name)) {
				namesList.add(name);
			}
		}

		println("Unique names list contains: ");

		for (int i = 0; i < namesList.size(); i++) {
			println(namesList.get(i));
		}
	}

}
