package edu.handong.csee.java.lab14.prob5;

public class MyException extends Exception{ // declare class that extends to throw exception
	private String message = null; // set message as private string with no value
	
	public MyException() { // declare constructor
		super(); // run super class
	}
	
	public MyException (String message) { // declare constructor with an input
		super(message); // run super class with input
		this.message = message; // set the instance's message from input
	}
	
	public MyException (Throwable cause) { // declare constructor with throwable input
		super(cause); // run super class with input
	}
	
	public String toString() { // declare method
		return message; // return message
	}
}
