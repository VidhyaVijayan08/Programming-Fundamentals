package com.chainsys.day3;

import java.nio.file.spi.FileSystemProvider;
import java.util.Scanner;

public class AverageProduct {
//	Take integer inputs from user until he/she presses q ( Ask to press q to quit after every integer input ). 
//	Print average and product of all numbers.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		char q;
		System.out.println("Enter An Input");
		i = sc.nextInt();
		
		if(i>0) {
			System.out.println("After Entering Input Press q to Quit ");
			q = sc.next().charAt(0);		
			
		}else {
			System.out.println("Invalid");//validation
		}
	}
}
