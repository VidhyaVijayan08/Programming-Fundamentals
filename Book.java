package com.chainsys.day2;

import java.util.Scanner;

public class Book {
	
	public static void main(String[] args) {
		
		int bookid;
		String bookname;
		Scanner sc = new Scanner(System.in);
		Reading();
		System.out.println("Please Enter Book Id :-");
		bookid = sc.nextInt();
		System.out.println("Book Id =  " + bookid);
		
		System.out.println("*********************");
		
		System.out.println("Please Enter Book name :-");
		bookname = sc.nextLine();
		System.out.print("Book Name = " + bookname);
		
	
		
	}

	private static void Reading() {
		
		System.out.println("I am Reading Story Book");
		
	}
}
