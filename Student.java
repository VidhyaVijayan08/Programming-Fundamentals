package com.chainsys.day3;

import java.util.Scanner;

public class Student {
	public static void main(String[] args) {
		/*
		 * A student will not be allowed to sit in exam if his/her attendence is less
		 * than 75%. Take following input from user Number of classes held Number of
		 * classes attended. And print percentage of class attended Is student is
		 * allowed to sit in exam or not. Also decide to allow student to sit if he/she
		 * has medical cause. Ask user if he/she has medical cause or not ( 'Y' or 'N' )
		 * and print accordingly.
		 */

		int classHeld;
		int classAttended;
		char medicalIssue;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number Of Classes Held:");
		classHeld = sc.nextInt();

		if (classHeld > 0) {
			System.out.println("Enter The Number Of classes Attended:");
			classAttended = sc.nextInt();
			System.out.println("Do You Have Medical Issues(Y/N)");
			medicalIssue = sc.next().charAt(0);
			int percentage = (classAttended * 100) / classHeld;
			System.out.println("Percentage is:" + percentage);
			if (percentage >= 75 || medicalIssue == 'Y') {
				System.out.println("Student Are Allowed To Sit In Exam Hall");
			} else if (percentage >= 75 || medicalIssue == 'N') {
				System.out.println("Student!, You Are Allowed To Sit In Exam Hall");
			} else {
				System.out.println("Student!, You  Are Not Allowed To Sit");
			}
		} else
			System.out.println("Invalid");// validation

	}
}
