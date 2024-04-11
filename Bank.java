package com.chainsys.day2;

import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
			int bid;
			String bname;
			String branch="Avadi";
			
			System.out.println("Welcome To SBI");
			System.out.println("Please Enter Bank ID : " );
			bid = sc.nextInt();
			System.out.println("*************************");
			System.out.println("Entered Bank ID : " + bid);
			
			System.out.println("Please Enter Bank Name : " );
			bname = sc.next();
			System.out.println("*************************");
			System.out.println("Entered Bank Name : " + bname);
			
			
			System.out.println("*************************");
			System.out.println("Please Enter Branch : " + branch);
			System.out.println("*************************");

			withdraw();
			deposit();
			
			
			
	}

	private static void withdraw() {
		System.out.println("Withdraw Done Successfully");
	}
	private static void deposit(){
		System.out.println("Deposit Done Successfully");
		
	}
}
