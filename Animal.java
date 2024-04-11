package com.chainsys.day2;

import java.util.Scanner;

public class Animal {
	public static void main(String[] args) {
/*
 	legs = no 
 	claws = no
 	name = character
 	tail = boolean
 	group = char
 	sense = no
 	habitat = character
 
 */
		//variable declaration - datatype variableName;
		//8 - primitive datatype // Non Primitive 
		//byte, short, int, float, double, long, boolean, char - default values
		// variable declaration - int claws;
		// variable assignment - claws = 8
		// variable initialization  - boolean hastail = true;
		
		int legs;
		int claws;
		boolean hastail;
		char group;
//		int sense;
		char habitat;
		legs=6;
		System.out.println("legs : " + legs);
		//to get values from the user, use Scanner
		Scanner sc = new Scanner(System.in);	
		{	
			System.out.println("Please Enter The Animal Sense :");
			int sense = sc.nextInt();
			System.out.println("Please Enter Name For Ur Pet :");
			String name = sc.next();
			System.out.println(name +  " Nice Name");

		}
	
	}
}
