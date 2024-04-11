package com.chainsys.day5;

import java.util.regex.Pattern;

public class MetaCharacter {

	public static void main(String[] args) {
		System.out.println("metacharacters d....");//d means digit  
		System.out.println(Pattern.matches("\\d", "abc"));//false (non-digit)
		System.out.println(Pattern.matches("\\d","1")); //true(digit and comes once)
		System.out.println(Pattern.matches("\\d", "4443"));//false(digit but comes more than once)
		System.out.println(Pattern.matches("\\d", "323abc"));//false(digit and char)
		
		System.out.println("metacharacters D....");//D means non-digit
		
		System.out.println(Pattern.matches("\\D", "abc"));//false(non-digit but comes more than once)
		System.out.println(Pattern.matches("\\D","1"));//false(digit)
		System.out.println(Pattern.matches("\\D", "4443"));//false(digit)
		System.out.println(Pattern.matches("\\D", "323abc"));//false(digit and char)
		System.out.println(Pattern.matches("\\D", "m"));//true (non-digit and comes once)	
		
		// comparing any word character with a word 
        // character so return true else false 
        System.out.println(Pattern.matches("\\w", "a")); //true 
        System.out.println(Pattern.matches("\\w", "2")); //true 
        System.out.println(Pattern.matches("\\w", "$")); //false 
  
        // comparing any non word character with special 
        // symbols & whitespaces return true else false 
        System.out.println(Pattern.matches("\\W", "2")); //false 
        System.out.println(Pattern.matches("\\W", " ")); //true 
        System.out.println(Pattern.matches("\\W", "$")); //true 
        
        // comparing any whitespace character with a white 
        // space so return true else false 
        System.out.println(Pattern.matches("\\s", " ")); //true 
        System.out.println(Pattern.matches("\\s", "2")); //false 
        
        // comparing any non whitespace character with a non 
        // white space character so return true else false 
        System.out.println(Pattern.matches("\\S", "2")); //true 
        System.out.println(Pattern.matches("\\S", " ")); //false 
        
        // \b says that a string must have boundary letters 
        // of word characters 
        System.out.println( 
            Pattern.matches("\\bGFG\\b", "GFG")); // true 
        System.out.println( 
            Pattern.matches("\\b@GFG\\b", "@GFG")); // false 
  
        // \B says that a string must have non word 
        // characters as boundaries 
        System.out.println(Pattern.matches("\\B@GFG@\\B", "@GFG@")); // true 
        System.out.println(Pattern.matches("\\BGFG\\B", "GFG")); // false 
        
        // \d-number 
        // \D-Non Digit 
        // \s-Any White Space 
        // \S-Non White Space character 
        // \w-any word character like  numbers/characters 
        // \W-special symbols 
        System.out.println(Pattern.matches( 
            "\\d\\D\\s\\S\\w\\W", "1G FG!")); // true 
        
        System.out.println(Pattern.matches( 
            "\\d\\D\\s\\S\\w\\W", "World!")); // false 
    	} 
	}
 


