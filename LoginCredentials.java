package com.chainsys.day3;

import java.util.Scanner;

public class LoginCredentials {

	public static void main(String[] args) {
//		Get a login credentials from user, if valid allow to login

		String username, password, username1, password1;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Username");
		username = sc.next();
		System.out.println("Enter Your Password");
		password = sc.next();
		System.out.println("Re Enter Your Username");
		username1 = sc.next();
		System.out.println("Re Enter Your Password");
		password1 = sc.next();

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
