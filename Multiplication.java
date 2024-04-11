package com.chainsys.day3;

import java.util.Iterator;

public class Multiplication {
	public static void main(String[] args) {
//		Print the following patterns using loop :
//			 
//			a.
//			*
//			**
//			***
//			****
		int j = 2;
		for (int i = 1; i <= 10; i++) {
			System.out.println(j + "*" + i + "=" + j * i + "");
		}
	}
}
