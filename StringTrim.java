package com.chainsys.day4;

public class StringTrim {

	public static void main(String[] args) {
		String str = "   Hello World   ";
		System.out.println(str.trim());//Returns a string whose value is this string, with all leading and trailing space removed, where space is defined as any character whose codepoint is less than or equal to 'U+0020' (the space character).
	}

}
