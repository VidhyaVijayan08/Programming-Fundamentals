package com.chainsys.day3;

import java.util.Scanner;

public class LoginCredential {

	public static void main(String[] args) {
//		Get a login credentials from user, if valid allow to login

		String username, password, username1 = "abc", password1 = "123";

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Username");
		username = sc.nextLine();
		System.out.println("Enter Your Password");
		password = sc.nextLine();

		if (username.equals(username1) && password.equals(password1)) {
			m1();
		} else {
			System.out.println("Login Failed");
		}

	}

	public static void m1() {
		System.out.println("Login Successful");
	}
}
