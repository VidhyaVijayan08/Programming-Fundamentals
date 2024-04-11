package com.chainsys.day3;

import java.util.Scanner;

public class Raining {
	public static void main(String[] args) {

//		Write a program that will accept as input from the user, an answer to the following question: 
//		Is it raining? If it is raining, tell the user to get an umbrella. 
//		Based on the temperature, either tell the user to bring a heavy jacket (colder than 32 degrees), 
//		light jacket (between 32 and 50 degrees), or no jacket at all.

		char r;
		int t;
		Scanner sc = new Scanner(System.in);
		System.out.println("Is it Raining(Y/N)");
		r = sc.next().charAt(0);
		System.out.println("enter the temperature");
		t = sc.nextInt();

		if (t > 0 && t <= 60) {
			if (r == 'Y' || r == 'y')
				System.out.println("Bring umbrella");
			if (t < 32)
				System.out.println("Bring heavy jacket");
			else if (t >= 32 && t <= 50)
				System.out.println("Bring light jacket");
			else
				System.out.println("No need for jacket");
		} else
			System.out.println("INVALID DATA");// validation
	}
}