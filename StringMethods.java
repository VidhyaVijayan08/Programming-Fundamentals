package com.chainsys.day4;

public class StringMethods {
	public static void main(String[] args) {
		String str="Hello World";
		String str1 = "   Hello World   ";		
		String str2 = "Welcome";
		//Replace of String
		System.out.println("Replace of String : "+ str.replace("World", "Welcome"));// replace the string
		//Trim
		System.out.println(str1.trim());//Returns a string whose value is this string, with all leading and trailing space removed, where space is defined as any character whose codepoint is less than or equal to 'U+0020' (the space character).
		//indexOF
		System.out.println(str.indexOf('e')); //Returns the index within this string of the first occurrence of the specified character.
		//lastIndexOf
		System.out.println(str.lastIndexOf('d'));//Returns the index within this string of the last occurrence of the specified character.
		//lastImdexOf
		System.out.println(str.lastIndexOf('W', 7));//Returns the index within this string of the last occurrence of the specified character, searching backward starting at the specified index.
		//toCharArray
		System.out.println(str.toCharArray());//Converts this string to a new character array.
	}
}
