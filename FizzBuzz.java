package com.chainsys.day3;

import java.util.Scanner;

public class FizzBuzz {
	/*Write a program that prints the numbers from 1 to 100. 
	But for multiples of three print “Fizz” instead of the number and for the multiples of five print “Buzz”. 
	For numbers which are multiples of both three and five print “FizzBuzz”."*/

	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter i value =");
		i=sc.nextInt();
		if(i>0 && i<=100) {
        	for (i = 1; i <= 100; ++i) {
                if (i % 3 == 0 && i % 5 == 0) {
                	System.out.println("FizzBuzz");
                }
                else if (i % 3 == 0) {
                	  System.out.println("Fizz");
                }
                else if (i % 5 == 0) {
                    System.out.println("Buzz");
                }
                else {
                	System.out.println(i);
                }
            }	
        }else {
        	System.out.println("Invalid");
        }
	}
}
