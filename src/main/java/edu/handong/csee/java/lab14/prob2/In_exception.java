package edu.handong.csee.java.lab14.prob2;
import java.util.*; // import java utilities

public class In_exception { // declare class
	private int x = 0, y = 0; // set x and y as private integer and set both as 0
	
	public In_exception(){
	}
	public void error_det() { // declare method
	
	    try{ // try these lines first
	    		Scanner keyboard = new Scanner(System.in); // to get user input
	    		System.out.print("x: "); // print x:
	    		x = keyboard.nextInt();// get input from user for x
	    		System.out.print("y: "); // print y:
	    		y = keyboard.nextInt(); // get input from user for y
	    		System.out.println(this.x/this.y); // print x / y
	    		keyboard.close();
	    }
	    catch(ArithmeticException e){ // catch case of y being 0
	        System.out.println("java.lang.ArithmeticException: " + e.getMessage()); // print exception message
	    }
	    catch(InputMismatchException e){ // catch wrong input type case for x and y
	        System.out.println("java.util.InputMismatchException"); // print exception message
	    }
	    catch(Exception e) { // catch all other exception case
	 System.out.println("Some other exception has occurred: " + e.getMessage()); // print exception message
	    }
	}
}

