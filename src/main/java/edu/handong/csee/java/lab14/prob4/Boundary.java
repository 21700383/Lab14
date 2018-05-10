package edu.handong.csee.java.lab14.prob4;

public class Boundary { // declare new class
	private static int [] arr = new int[5]; // set arr as private integer with length 5
	private static int cnt = 0; // set cnt as private intger with value 0
	
	public void receive(int num) throws ArrayIndexOutOfBoundsException{ // declare method that receives an input that extends to throw exception
		int i = cnt; // set i as integer with value from cnt
		arr[i] = num; // set arr[i]'s value from num
		cnt++; // increase count by 1
		System.out.printf("arr[%d] <- %d\n", i, num); // print message of arr[i] and its value
	}
}

