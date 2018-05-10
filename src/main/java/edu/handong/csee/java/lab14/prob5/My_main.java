package edu.handong.csee.java.lab14.prob5;
import java.util.Scanner;

public class My_main { // declare class
	public static void main(String[] a){ // declare main method
		try { // try these codes
			Scanner keyboard = new Scanner(System.in); // to get user input
			String str = keyboard.nextLine(); // set str as string and get value from user
			My_main.myTest(str); // run class's method myTest with str as input
			keyboard.close(); // close keyboard instance
		} catch(MyException mae) { // catch exception from MyException and message
			System.out.println("Inside catch block: " + mae); // print the message
		}
	}
	
	static void myTest (String str) throws MyException{ // declare method which throws MyException
		if (str.equals("null")) { // if str's value is equal to NULL
			throw new MyException("String val is null"); // throw exception message	
		}
		else { // else
			System.out.println("String val is:" + str); // throw message
		}
	}
}
