package com.chainsys.day3;

import java.util.Scanner;

public class PlaceOfService {
	public static void main(String[] args) {
		int age;
		char b,c,d;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter Your Age");
		age=sc.nextInt();
		
		//validation
		if(age>0) {
			
			System.out.println("Please Enter Your Gender(F/M)");
			b=sc.next().charAt(0);
			
			System.out.println("Please Enter Your Marital Status (Y/N)");
			c =sc.next().charAt(0);
			
			if (b=='F'|| b=='f') {
				System.out.println("she will work only in urban areas");
			}else if((b=='M'||b=='m') && (age>=20 && age<=40)) {
				System.out.println("he may work in anywhere");
			}else if((b=='M'||b=='m') && ( age>=40 && age<=60)) {
				System.out.println("he will work in urban areas only");
			}else if(age>60||( age<20 && age>=0)) { 
				System.out.println("ERROR");
			}
			
			}else {//validation
				System.out.println("Invalid");
			}
		
		
		}
}
