package com.chainsys.day3;

import java.util.Scanner;

public class LogicalOperators {
	public static void main(String[] args) {
//	logical operators(<,<=,>,>=,==) directly to the variables and print
//	the values
		
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Value of a :");
		a=sc.nextInt();
		System.out.println("Enter the Value of b :");
		b=sc.nextInt();
		
		if(a>=0 &&b>=0) {
			if(a < b && a <= b) {
				System.out.println("A is lesser than B and A is lesser than or equal to B");
			}
			else {
				System.out.println("B is lesser than A and B is lesser than equal to A");
			};
			
			if(a < b || a <= b) {
				System.out.println("A is lesser than B or A is lesser than or equal to B");
			}
			else {
				System.out.println("B is lesser than A or B is lesser than equal to A");
			};
			
			
			if(a > b && a >= b) {
				System.out.println("A is greater than B and A is greater than or equal to B");
			}
			else {
				System.out.println("B is greater than A and B is greater than or equal to A");
			}
			
			if (a == b ) {
				System.out.println("A is equal to B");
			}
			else {
				System.out.println("A is not equal to B");
			}
		}else {
			System.out.println("Invalid Data");//validation
		}
		
		
	} 
}
