package com.chainsys.day4;

import java.util.Scanner;

public class Method {

	public static void main(String[] args) {
		System.out.println("Method");
		
		int cid = 5;
		String cname;
		int cage;
		String cgender;
		
		System.out.println("*********************");
		
		System.out.println("Student ID : " + cid);
		Scanner sc = new Scanner(System.in);
		System.out.println("*********************");
		System.out.println("Please Enter Student Name");
		cname = sc.nextLine();
		System.out.println("*********************");

		System.out.println("Entered Student Name : " + cname);
		{
			System.out.println("*********************");
			System.out.println("Please Enter Student Gender");
			cgender = sc.nextLine();
			System.out.println("*********************");
			System.out.println("Entered Student Gender : " + cgender);
			System.out.println("*********************");
			System.out.println("Please Enter Student Age");
			cage = sc.nextInt();
			System.out.println("*********************");
			System.out.println("Entered Student Age : " + cage);
			System.out.println("*********************");
			reading();
			
		} 
		
	}

	private static void reading() {
		System.out.println("Status - I am Reading OOPS Concept ");
	}
	

		
		
}
