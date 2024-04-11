package com.chainsys.day4;

import java.util.Scanner;

public class StringIsEmpty {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String : ");
		String str;
		str= sc.nextLine();
		str.isEmpty();
		
		if(str.isEmpty()) {
			System.out.println(false);
		}else {
			System.out.println(true);
		}
		
		if(str.length()==0) {
			System.out.println(false);
		}else {
			System.out.println(true);
		}
	}
		
	public boolean isEmpty() {
		return false;	
	}
}
