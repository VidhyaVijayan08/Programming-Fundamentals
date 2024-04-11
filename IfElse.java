package com.chainsys.day3;

public class IfElse {
//	Check out, what happens when the if-else condition is ended with a semicolon

	public static void main(String[] args) {
		int a=5,b=10;
		
		if(a>0 && b>0) {
			if(a>b)
			{
				System.out.println("A is greater than B");
			}else {
				System.out.println("B is greater than A");
			}; 
		}else {
			System.out.println("Invalid Data");
		}
		
		
			
	}
}
