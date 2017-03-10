package e88;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author nurulatiqahali
 * search student name in the list
 */
public class Main3 {
	/**
	 * @param args. check if empty. search student name.
	 */
	public static void main(String[] args) {

		ArrayList<Student> list = new ArrayList<Student>();
		Scanner scanner = new Scanner(System.in);
		String nameS = "";
		String sNum = "";
		String sTerm = "";

		while (true) {
			System.out.println("name: ");
			nameS = scanner.nextLine();

			if (nameS.isEmpty()) {
				break;
			}

			System.out.println("studentnumber: ");
			sNum = scanner.nextLine();
			list.add(new Student(nameS, sNum));
		}
		for (Student wordE : list) {
			System.out.println(wordE);
		}

		System.out.println("Give a search term: ");
		sTerm = scanner.nextLine();

		for (Student d : list) {
			if (d.getName().contains(sTerm)) { // if(d.getName() != null &&
												// ____)
				System.out.println(d);
			}
			// something here
		}

	}
}
