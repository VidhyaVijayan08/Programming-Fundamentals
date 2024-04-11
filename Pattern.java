package com.chainsys.day3;

import java.util.Iterator;
import java.util.Scanner;

public class Pattern {
//	Print the following patterns using loop :
//		 
//		a.
//		*
//		**
//		***
//		****

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = 5;
		if (n > 0) {
			for (int i = 1; i < n; i++) {
				System.out.println("");
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
			}
		} else {
			System.out.println("Invalid Data");
		}

	}
}
