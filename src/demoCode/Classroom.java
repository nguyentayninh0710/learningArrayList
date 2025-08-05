package demoCode;

import java.util.ArrayList;

public class Classroom {
	private ArrayList<Student> students;

	public Classroom(){
		students = new ArrayList<Student>();
	}
	
	public void addStudent(Student s) {
		students.add(s);
	}
	
	public void printStudents() {
		for (Student s : students) {
			System.out.println(s.toString());
		}
	}
	
}
