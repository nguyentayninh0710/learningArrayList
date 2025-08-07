package demoCode;

import java.util.ArrayList;
import java.util.Scanner;

//Exercise 1: Create a program to manage a list of integers
//Input n integers from the user
//
//Display the list
//
//Remove all even numbers
//
//Display the updated list
public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> integers = new ArrayList<Integer>();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input number of integers: ");
		int n = scanner.nextInt();
		
		for(int i = 0; i < n; i++ ) {
			System.out.println("Input number: ");
			int number = scanner.nextInt();
			integers.add(number);
		}
		
		//Display
		for(int num : integers) {
			System.out.print(num + " ");
		}
		
		System.out.println();
		
		//Remove even numbers 
		for(int i = integers.size()-1 ; i >= 0; i-- ) {;
			if(integers.get(i) % 2 == 0) {
				integers.remove(i);
			}
		}
		
		
		System.out.println();
		
		//Display
		for(int num : integers) {
			System.out.print(num + " ");
		}
				
		
		
	}

}
