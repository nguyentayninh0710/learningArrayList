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
				
		
		
		/*
		
		
		index: 0  1   2   3   4   5
		num  : 2  7  11  44   6  23
		
		
		for (int i = 0; i < n; i++) {
		    if (integers.get(i) % 2 == 0) {
		        integers.remove(i);
		    }
		}
		
		i = 0	n = 6 	integers.get(0) = 2   integers.remove(i=0)     (even) 
				   *
		--> index: 0  1   2   3   4   5
			num  : 7  11  44  6  23						#skip 7
		
		i++
		
	
		i = 1	n = 6 	integers.get(1) = 11  (odd)
	
		              *
		--> index: 0  1   2   3   4   5
			num  : 7  11  44  6  23
		
		
		i++
						  *
		--> index: 0  1   2   3   4   5
			num  : 7  11  44  6  23
		
		i = 2	n = 6 	integers.get(2) = 44  integers.remove(i=2)     (even) 

						  *
		--> index: 0  1   2   3   4   5
			num  : 7  11  6  23							#skip 6
			
		
		i++
						  	  *
		--> index: 0  1   2   3   4   5
			num  : 7  11  6  23
		
		i = 3	n = 6 	integers.get(3) = 23  (odd)
		
								  *
		--> index: 0  1   2   3   4   5
			num  : 7  11  6  23
			
		complete list: 7 11 6 23
		STOP 
		skip 7 and skip 6
		
		
		
		index: 0  1  2   3   4   5
		num  : 2  7  11  44  6  23
		
		
		for (int i = 0; i < integers.size(); i++) {
		    if (integers.get(i) % 2 == 0) {
		        integers.remove(i);
		    }
		}
		
		
		i = 0	size = 6 	integers.get(0) = 2   integers.remove(i=0)     (even) 
				   *
		--> index: 0  1   2   3   4   5
			num  : 7  11  44  6  23						
		
		i++										//skip 7 
		
					  *
		--> index: 0  1   2   3   4  
			num  : 7  11  44  6  23		
		
		i = 1	size = 5 	integers.get(1) = 11   (odd)
		
					  *
		--> index: 0  1   2   3   4  
			num  : 7  11  44  6  23	
		
		i++
					      *
		--> index: 0  1   2   3   4  
			num  : 7  11  44  6  23	
		
		i = 2	size = 5 	integers.get(2) = 44   integers.remove(i=2)     (even) 
		
						  *
		--> index: 0  1   2   3   4  
			num  : 7  11  6  23	
		
		i++ 									# skip 6
						      *
		--> index: 0  1   2   3     
			num  : 7  11  6  23	
			
		i = 3	size = 4 	integers.get(3) = 23   (odd)
		
		complete list: 7 11 6 23
		
		STOP 
		skip 7 and skip 6
		
		
		
		
		
		*/
		
		
	}

}
