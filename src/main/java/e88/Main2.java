package e88;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author nurulatiqahali, 
 * add student and studentnumber to the list 
 */
public class Main2 {
	public static void main(String[] args) {

		ArrayList<Student> list = new ArrayList<Student>();
		Scanner scanner = new Scanner(System.in);
		String n = "";
		String sn = "";

		while (true) {
			System.out.println("name: ");
			n = scanner.nextLine();

			if (n.isEmpty()) {
				break;
			}

			System.out.println("studentnumber: ");
			sn = scanner.nextLine();
			list.add(new Student(n, sn));
		}
			for (Student wordE : list) {
				System.out.println(wordE);
			}

		

	}
}
