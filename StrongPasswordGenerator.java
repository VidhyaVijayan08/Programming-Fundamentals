//package com.chainsys.day5;
//
//import java.security.SecureRandom;
//
//public class StrongPasswordGenerator {
//	private static final String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//	private static final String lower = upper.tolowerCase();
//	private static final String digits = "0123456789";
//	private static final String special = "!@#$^&*()";
//	private static final String all = upper + lower + digits + special;
//	
//	public static void main(String[] args) {
//		int length = 12; // you can change the length as per your requirement
//		
//		String password = generateStrongPassword(length);
//		System.out.println("Strong Password: " + password);
//	}
//
//	public static String generateStrongPassword(int length) {
//		SecureRandom random = new SecureRandom();
//		StringBuilder password = new StringBuilder(length);
//		
//		//Ensure at least one character from each category
//		password.append(upper.charAt(random))
//		
//		return null;
//	}
//			
//			
//			 
//}
