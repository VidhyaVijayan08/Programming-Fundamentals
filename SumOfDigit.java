package com.chainsys.day3;

import java.util.Scanner;

public class SumOfDigit {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Value Of N : ");
		n = sc.nextInt();
		int sum = 0;
		// validation
		if (n > 0) {
			while (n > 0) {
				int last = n % 10;
				sum = sum + last;
				n = n / 10;
			}
		} else {
			System.out.println("Invalid Output");
		}
		System.out.println(sum);
	}
}
