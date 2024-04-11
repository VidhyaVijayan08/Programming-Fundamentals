package com.chainsys.day2;

import java.util.Scanner;

public class Operators {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
//		Operators
		System.out.println(" Operators : ");
//		1. Arithmetic Operator
		System.out.println("Arithemetic Operators");
		System.out.println("***********************");
		int a=5;
		int b=10;
		int c,d;
		c=a+b;
		
		System.out.println(c);
		System.out.println("***********************");
//		2. Relational Operator
		System.out.println("The Relational Operator ");
		System.out.println("**********************");
		if(a>b) {
			System.out.println("A is greater than B");
			System.out.println("********************");
		}
		else {
			System.out.println("B is greater than A");
			System.out.println("********************");
		}
		
//		3. Equality Operator
		System.out.println("The Assignment Operator");
		System.out.println("************************");
		c=5;
		if(a==c) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
		d=4;
		if(c!=d) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
			
		
//		4. logical Operator
		System.out.println("The Logical Operator");
		System.out.println("***********************");
		System.out.println("Enter D value :");
		d = sc.nextInt();
//		=> AND Operator
		if(c == 5 && d ==5) {
			System.out.println(" Both condition should be satisfied");
		}
		else {
			System.out.println("Both conditions are not satisfied");
		}
//		=> OR Operator
		if(c==5 || d==10) {
			System.out.println("Any one of the condition should be satisfied");
		}
		else {
			System.out.println("Any one of the condition is not satisfied");
		}
		
	}
}
