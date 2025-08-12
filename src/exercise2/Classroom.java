package exercise2;

import java.util.ArrayList;

public class Classroom {
	private ArrayList<Student> students = new ArrayList<>();
	
	public void addStudent(Student st) {
		students.add(st);
	}
	
	public ArrayList<Student> Display() {
		return students;
	}
	
	public Student searchStudent(String name) {
		for(Student st : students) {
			if (st.getName().equals(name)) {
				return st;
			}
			
		}
		return null;
	}
	
	public void removeStudent(String name) {
		for(Student st : students) {
			if (st.getName().equals(name)) {
				students.remove(st);
			}
			
		}
	}
	
	
	
	
	
}
