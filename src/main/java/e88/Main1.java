package e88;

/**
 * @author nurulatiqahali , print student name n student number
 *
 */
public class Main1 {
	public static void main(String[] args) {
        Student pekka = new Student("Pekka Mikkola", "013141590");
        System.out.println("name: " + pekka.getName());
        System.out.println("studentnumber: " + pekka.getStudentNumber());
        System.out.println(pekka);
    }
}
