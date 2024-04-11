package com.chainsys.day3;

public class SumOfDigits {
	public static void main(String[] args) {
		int n = 123;
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
