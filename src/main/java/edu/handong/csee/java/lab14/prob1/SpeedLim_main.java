package edu.handong.csee.java.lab14.prob1;
import java.util.Scanner;
import java.util.Random;

public class SpeedLim_main { // declare class

	public static void main(String[] args) { // declare main method
		Scanner keyboard = new Scanner(System.in); // to get user input
		Random rand = new Random(); // to get random number
		int limit = 0, speed = 0; // set limit and speed as integer and set both to 0
		
		System.out.print("Set the speed limit, officer: "); // print message to tell the user to input speed limiter
		limit = keyboard.nextInt();// get limit from keyboard
		speed = rand.nextInt(101); // set speed. set maximum random number to 100.
		
		SpeedLimitter lim = new SpeedLimitter(limit, speed); // create new instance of SpeedLimiter as lim
		
		lim.warnSpeedLimit(); // run warnSpeedLimit method of lim
		keyboard.close(); // close keyboard instance
	}
}
