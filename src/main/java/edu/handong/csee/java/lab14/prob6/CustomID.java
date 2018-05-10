package edu.handong.csee.java.lab14.prob6;

public class CustomID extends Exception{ // declare class that inherits from Exception
	private String[] races = new String[]{"Vulcans", "Romulan", "Klingons"}; // declare races as private string array with 3 values
	private String name = ""; // set name as private string with blank value
	private int age = 0; // set age as private integer with value 0
	private String race = ""; // set race as private string with blank value
	private int state = 0; // set state as private integer with value 0

	public void set_name(String str) throws Exception { // declare method that throws exception
		if(str.length() < 5) { // if str's length is less than 5
			state = 0; // state is 0
			throw new Exception("Your name is short! Try again!"); // throw exception message
		}
		else { // else
			this.name = str; // the instance's name = str
			System.out.println("Name is valid"); // print message
			System.out.println("Name: " + this.name); // print the current name
			state++; // increase state by 1
		}
	}
	
	public void set_age(int num) throws Exception { // declare method that throws exception
		if(num < 18) { // if num is less than 18
			state = 1; // state is 1
			throw new Exception("You are too young! Try again!"); // throw exception message
		}
		else { // else
			this.age = num; // the instance's age is num
			System.out.println("Age is valid"); // print message
			System.out.println("Age: " + this.age); // print current age
			state++; // increase state by 1
		}
	}

	public void set_race(String race) throws Exception{ // declare method that throws exception
		for(int i = 0; i < races.length; i++) { // for loop that repeats until checking every race
			if(races[i].equals(race)) { // if input is equal to races[i]
				this.race = races[i]; // instance's race is equal to races[i]
				System.out.println("Race is valid"); // print message
				System.out.println("Race: " + races[i]); // print current race
				state = 0; // reset state to 0
				return; // end method
			}
		}
		state = 2; // state is equal to 2 if for loop is finished
		throw new Exception("Human! Try again."); // throw exception message
	}
	
	public int getState() { // declare method that 
		return state; // return state
	}
}


