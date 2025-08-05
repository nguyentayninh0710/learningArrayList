package demoCode;

import java.util.ArrayList;

public class myArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Mazda");
		cars.add("Ford");
		
		System.out.println(cars.getFirst()); 
		System.out.println(cars.getLast());
		System.out.println(cars.get(2)); 
		
		Classroom myClassroom = new Classroom();
		myClassroom.addStudent(new Student("Minh", 17));
		myClassroom.addStudent(new Student("An", 16));
		myClassroom.printStudents();
		
	}

}
