package com.chainsys.day5;
import java.util.regex.*;

public class PhoneNumber {
	public static void main(String[] args) {
		String phoneNumber = "1234567890";
		String regex = "\\d{4}\\d{4}\\d{2}";
		
		Pattern pattern = Pattern.compile(regex);
		
		Matcher matcher = pattern.matcher(phoneNumber);
		boolean valid = matcher.matches();  
		if(valid) {
			System.out.println("Phone Number is Valid");
		}else {
			System.out.println("Phone Number is not Valid");
		}
				
	}
}
