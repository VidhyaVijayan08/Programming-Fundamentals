package com.chainsys.day4;

public class StringCodePointBefore {
//	Returns the character (Unicode code point) before the specified index. The index refers to char values (Unicode code units) and ranges from 1 to length.

	public static void main(String[] args) {
		String s= "Hello World Welcome";
		System.out.println(s.codePointBefore(3));
	}

	public static int codePointBefore​(int index) {
		return index;
		
	}
}
