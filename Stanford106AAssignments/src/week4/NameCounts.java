package week4;

import acm.program.*;
import java.util.*;

public class NameCounts extends ConsoleProgram {
	public void run() {
		HashMap<String, Integer> names = new HashMap<String, Integer>();

		// Get the list of names from the user
		while (true) {
			String name = readLine("Enter name: ");
			if (name.equals(""))
				break;
			// See if that name previously appeared in the map. Update
			// count if it did, or create a new count if it didn't.
			Integer count = names.get(name);
			if (count == null) {
				count = new Integer(1);
			} else {
				count = new Integer(count + 1);
			}
			names.put(name, count);
		}

		// print the list of names and number of occurances
		Iterator<String> it = names.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next();
			int count = names.get(key);
			println("Entry [" + key + "] has count " + count);
		}
	}

}