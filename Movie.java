package com.chainsys.day2;

import java.util.Scanner;

public class Movie {
	public static void main(String[] args) {
		
		String mname;
		String heroname;
		String heroinename;
		int age;
		boolean agelimit;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Movie name:");
		mname = sc.nextLine();
		System.out.println("Entered Movie Name :  " + mname );
		System.out.println("******************");
		
		System.out.println("Enter Hero Name :");
		heroname = sc.nextLine();
		System.out.println("Entered Hero Name : " + heroname);
		System.out.println("******************");

		System.out.println("Enter Heroine Name :");
		heroinename = sc.nextLine();
		System.out.println("Entered Heroine Name : " + heroinename);
		System.out.println("******************");	
		
		System.out.println("Enter your age:");
		age = sc.nextInt();
		System.out.println("Entered Age :" + age);
		
		if (age>18) {
			System.out.println(true);
			agelimit = sc.nextBoolean();
		}
		else {
			System.out.println(false);
			agelimit = sc.nextBoolean();
		}
	}
}
