package com.chainsys.day3;

public class MultiplicationTables {

	public static void main(String[] args) {
//			  Print the following patterns using loop :
//				  
//				  a.
//				  *
//				  **
//				  ***
//				  ****

		int num = 1;
		int i = 1;

		if (num > 0) {
			for (num = 1; num <= 10; num++) {

				System.out.print("Table of " + num + " is : ");
				for (i = 1; i <= 10; i++) {
					System.out.print(num * i + " ");
				}
				System.out.println();
			}
		} else {
			System.out.println("Invalid Data");// validation
		}

	}

}
