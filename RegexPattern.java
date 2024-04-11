package com.chainsys.day5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPattern {
	
//	Three Classes Of Regex
//	1. Pattern Class
//	2. Matcher Class
//	3. PatternSyntaxException Class
	
	
	public static void main(String[] arg) {

		// first way   

		// pattern is inbuilt class for regex in java

		Pattern pattern = Pattern.compile(".s");// dot(.) represents single character  

		//matcher is inbuilt class  for creating a matcher that matches the given input with the pattern.

		Matcher matcher = pattern.matcher("as");  

		boolean result_first = matcher.matches();  

		//2nd way  

		boolean result_second=Pattern.compile(".s").matcher("as").matches();  // single line search pattern  

		//3rd way  

		boolean result_third = Pattern.matches(".s", "as"); // shorthand search pattern

		System.out.println(result_first); // second character is ‘s’ so its matches  true

		System.out.println(result_second); //second character is ‘s’ so its matches  true

		System.out.println(result_third); //second character is ‘s’ so its matches  true

		}

}
