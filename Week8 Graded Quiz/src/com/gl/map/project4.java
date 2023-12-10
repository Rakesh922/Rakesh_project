package com.gl.map;
import java.util.Arrays;
public class project4 {

	    public static void main(String[] args) {
	        // Input array
	        int[] numbers = {1, 2, 3, 4, 5};

	        // Using Stream API
	        int result = Arrays.stream(numbers)
	                .filter(num -> num % 2 != 0)     // Filter odd numbers
	                .map(num -> num * num)          // Square the numbers
	                .sum();                         // Sum the squared numbers

	        // Output the result
	        System.out.println("OUTPUT: " + result);
	    }
}


