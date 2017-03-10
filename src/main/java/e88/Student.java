package e88;

public class Student {
	private String name;
	private String stuNum;

	/**
	 * @param name
	 * @param numStu
	 */
	public Student(String name,String numStu) {
		this.name = name;
		this.stuNum = numStu;
	}

	/**
	 * @return name of the student
	 */
	public String getName() {
		
		return name;
	}

	/**
	 * @return student number
	 */
	public String getStudentNumber() {
		return stuNum;
	}
	
	public String toString(){
		return name +" (" +stuNum +")";
	}

}
