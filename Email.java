package com.chainsys.day5;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {
	public static void main(String[] args) {
		
		String gmailId,password,regExpn;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Gmail id");
		gmailId =sc.next();
		
		// ways of creating regex
//		regExpn = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,20}$ +@[a-zA-Z0-9.]";
		
//		regExpn="^[a-zA-Z0-9_! #$%&'*+/=?`{|}~^. -]+@[a-zA-Z0-9. -]+$\";
//		regExpn = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
//		 regExpn = "^[A-Za-z0-9._%+-](?=.*[0-9])+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";

//		regExpn ="[A-Z]+[a-zA-Z_]+@\b([a-zA-Z]+.){2}\b?.[a-zA-Z]+";
//		regExpn = "\\b[A-Z0-9._%-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}\\b";
//		regExpn ="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])+@[A-Z0-9.-]+[A-Z]{2,4}";
		 regExpn ="^(?=.*[0-9])[a-z0-9+_.-]+@[a-z0-9.-]+$";

		
		Pattern pattern = Pattern.compile(regExpn, Pattern.CASE_INSENSITIVE);
	    Matcher matcher = pattern.matcher(gmailId);
		boolean validate = matcher.matches();  
		
		if(validate) {
			System.out.println("Correct Gmail");
			System.out.println("Enter your Password");
			password = sc.next();
		    regExpn = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,20}$";

		    Pattern patterns = Pattern.compile(regExpn, Pattern.CASE_INSENSITIVE);
		    Matcher matchers = pattern.matcher(password);
			boolean valid = matchers.matches();  
		    
			 if(valid) {
			    	System.out.println("Correct Password");
			    }else {
			    	System.out.println("Incorrect Password");
			    }
		}else {
			System.out.println("Incorrect Gmail!");
			System.out.println("It should satisfy upper case, lowercase, number, special char");
		}
	   
	}
}
