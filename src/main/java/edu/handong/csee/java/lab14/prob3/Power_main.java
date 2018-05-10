package edu.handong.csee.java.lab14.prob3;
import java.util.Scanner; // import Scanner utility

public class Power_main { // declare class
    
    public static void main(String[] args) { // declare main method
    	Powercalc my_calculator = new Powercalc(); // set my_calculator as new instance of Powercalc
    	Scanner in = new Scanner(System.in); // set in as new instance of Scanner
        int n = in.nextInt(); // set n as integer and get value from the user
        int p = in.nextInt(); // set p as integer and get value from the user
            
        try { // try the following code
        	System.out.println(my_calculator.power(n, p)); // print the result of my_calculator's power
        } catch (Exception e) { // catch the exception and its message
        	System.out.println(e); // print the message
        }
        in.close(); // close in instance
    }


}

