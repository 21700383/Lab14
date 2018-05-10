package edu.handong.csee.java.lab14.prob6;

import java.util.Scanner; // import Scanner utility

public class Custom_main { // declare star trek class
	
	public static void main(String[] args) { // declare star trek main method
		String name, race; // set name and race as string
		int age = 0; // set age as integer with value 0
		Scanner keyboard = new Scanner(System.in); // to get user input
		CustomID obj = new CustomID(); // create new instance of CustomID and name it obj
		boolean repeat = true; // set repeat as boolean with value true

		while(repeat) { // while repeat is true
			try { // try these lines first
				if(obj.getState() == 0) { // if obj's state is 0
					System.out.print("Enter your name: "); // print message to tell user to input string
					name = keyboard.nextLine(); // get user input
					obj.set_name(name); // set name for obj
					if (name == "Spock" || name == "spock") { // if name is Spock
						repeat = false; // repeat become false
						System.out.println("All right, go back to work"); // print message to quit slacking
					}
				}
				else if(obj.getState() == 1) { // else if obj's state is 1
					System.out.print("Enter your age: "); // print message to tell user to input integer
					age = keyboard.nextInt(); // get user input
					keyboard.nextLine(); // eat a line
					obj.set_age(age); // set age for obj
				}
				else if(obj.getState() == 2) { // else if obj's state is 2
					System.out.print("Enter your race: "); // print message to tell user to input string
					race = keyboard.nextLine(); // get user input
					obj.set_race(race); // set race for obj
				}
			}
			catch(Exception e){ // catch exception and its message
				System.out.println(e.getMessage()); // print the exception message
				continue; // carry on with the loop
			}
		}
		
	}
	
}


