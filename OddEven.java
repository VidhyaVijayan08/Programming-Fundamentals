package com.chainsys.day3;

import java.util.Scanner;

public class OddEven {
//	Write a program to find odd's and even's till n number and also cube of given n number

	public static void main(String[] args) {
		int  n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		n = sc.nextInt();
		// Validation
		if(n>0) {
			if (n % 2 == 0) {
				System.out.println("It is Even Number");
			} else {
				System.out.println("It is Odd Number");
			}
			System.out.println("The cube of given n number is " + n*n*n);
		}else {
			System.out.println("Sorry, Please Enter Positive Number");
		}
		
	}
}
