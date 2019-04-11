import list.*;
import file_reader.*;

public class Main {

	public static void main(String[] args) {

		QuotesList list = new QuotesList(); // deklarasi list

		/**
		 * see ReadFile documentation
		 */
		ReadFile readFile = new ReadFile("data/file.txt");

		for (String line : readFile.getLine()) {
			String[] parseLine = line.split("::");
			Quotes who = new Quotes(parseLine[0]);
			if (!list.search(who)) {
				list.add(who);
			}
		}

		list.display();
		System.out.println(list.getSize());
	}
}
