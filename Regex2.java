package com.chainsys.day5;

import java.util.Scanner;

public class Regex2 {
	public static void main(String[] args) {
		String password;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Password");
		password = sc.nextLine();
		boolean result = false;
		if(password!= null) {
					String minLength ="8";
					String maxLength = "20";
					boolean specialCharNeed = false;
					String oneDigit = "(?=.*[0-9])";
					String lowerCase = "(?=.*[a-z])";
					String upperCase = "(?=.*[A-Z])";
		            String specialChar = specialCharNeed ? "(?=.*[@#$%^&+=])" : "";
		            String noSpace = "(?=\\S+$)";
		            String minMaxChar = ".{" + minLength + "," + maxLength + "}";
		            String pattern = oneDigit + lowerCase + upperCase + specialChar + noSpace + minMaxChar;
		            
		            assertTrue(password.matches(pattern));
		}else {
			System.out.println("Login failed");
		}
	}

	private static String assertTrue(boolean matches) {
		return "Login Successfull";
	}
}
		

//		    } catch (Exception ex) {
//		        ex.printStackTrace();
//		        fail("Exception occurred: " + ex.getMessage());
//		    }
//		
//	}
//
//
//		private static void assertTrue(boolean matches) {
//			// TODO Auto-generated method stub
//			
//		}
//
//		private static void fail(String string) {
//			// TODO Auto-generated method stub
//			
//		}
//}
