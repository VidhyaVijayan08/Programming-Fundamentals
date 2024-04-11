package com.chainsys.day3;

import java.util.Scanner;

public class EvenDigit {
//	Find the even digits in the given number.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n,i=1;
		System.out.println("Enter the input");
		n=sc.nextInt();
		
		if(n>0) {
			for(i=1;i<=n;i++) {
				if(i%2==0) {
					System.out.println(i);
				}
			}
		}else {
			System.out.println("Invalid Data");//validation
		}
		
	}
}
