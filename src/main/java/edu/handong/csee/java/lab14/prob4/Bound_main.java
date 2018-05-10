package edu.handong.csee.java.lab14.prob4;
import java.util.Scanner; // import Scanner utility

public class Bound_main { // declare class
	
	public static void main(String[] args) { // declare method
		Scanner keyboard = new Scanner(System.in); // to get user input
		int num = 0; // declare num as integer with value 0
		Boundary arr = new Boundary(); // set new instance of Boundary and name it arr
		boolean repeat = true; // set repeat as boolean with value true
		while(repeat){ // while repeat is true
			try{ // try the codes below first
			System.out.print("Enter an integer: "); // print message to tell user to input integer
				num = keyboard.nextInt(); // get user input
				arr.receive(num); // run receive method for arr
			}
			catch(ArrayIndexOutOfBoundsException e) { // catch exception for array index out of bound
				System.out.println("Invalid array index access!"); // print exception message
				repeat = false; // value of repeat becomes false to end loop
			}
		}
		
		keyboard.close(); // close keyboard instance
	}
	
}

