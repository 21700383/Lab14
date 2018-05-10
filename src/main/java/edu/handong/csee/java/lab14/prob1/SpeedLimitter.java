package edu.handong.csee.java.lab14.prob1;

public class SpeedLimitter { // declare class
	private int limit = 0; // set limit as private integer and set it as 0
	private	int speed = 0; // set speed as private integer and set it as 0
	public SpeedLimitter(int limit, int speed) { // declare constructor with 2 input
		this.limit = limit; // set limit of the instance from input value
		this.speed = speed; // set speed of the instance from input value
	}
	
	public void warnSpeedLimit() { // declare method
		try { // first try these lines
			if(this.speed > this.limit) { // if the speed of the instance is bigger than speed limit
				throw new Exception("Speed Limit" + this.limit + "exceeded!"); // throw new exception showing speed limited
			}
			System.out.println("You are a law abiding citizen, Mr.Cain"); // if not, print message that everything is alright
		} catch (Exception e) { // catch the custom made exception thrown
			System.out.println(e.getMessage()); // print the message thrown
			System.out.println("You are being fined. "); // print the message the person will be fined
		}
		System.out.println("Your current speed: " + this.speed); // print the speed of the instance
	}
}