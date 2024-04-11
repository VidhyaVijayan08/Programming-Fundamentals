package com.chainsys.day3;

import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
//		Get a login credentials from user, if valid allow to login

		String Username = "vidhya08";
		String Password = "vidhu";
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your username: ");
		String username = scanner.nextLine();
		System.out.print("Enter your password: ");
		String password = scanner.nextLine();
		if (username.equals(Username) && password.equals(Password)) {
			System.out.println("Login Successfull");
		} else {
			System.out.println("Login Failed");
		}

	}
}
