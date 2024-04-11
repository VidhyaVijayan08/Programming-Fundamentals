package com.chainsys.day5;

import java.util.Scanner;

public class RegexMatcher {

	public static void main(String[] args) {
		String phoneNumber1;
		String phoneNumber = "([a-z]{10})";
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your phonenumber");
		phoneNumber1=sc.next();
		
		if(phoneNumber1 == phoneNumber) {
			System.out.println("Valid PhoneNumber");
		}
		else {
			System.out.println("Not Valid PhoneNumber");
		}
	}
}
