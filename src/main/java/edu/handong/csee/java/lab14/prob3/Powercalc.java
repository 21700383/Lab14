package edu.handong.csee.java.lab14.prob3;

public class Powercalc { // declare new class
    public long power(int n, int p) throws Exception{ // declare new method which extends to handle exception
        long result = 0; // set result as long and initialize as 0
        
        if(n < 0 || p < 0) {// if n or p is less than 0
            throw new Exception("n or p should not be negative."); // throw message
        }
        if(n == 0 && p == 0) { // if n and p are both 0 ( 0 ^ 0 )
            throw new Exception("n and p should not be zero."); // throw message
        }
        result = (long)Math.pow(n, p); // result is the result of n ^ p
        
        return result; // return result if it went through all the exception checks
    }
}

