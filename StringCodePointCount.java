package com.chainsys.day4;

public class StringCodePointCount {
//	Returns the number of Unicode code points in the specified text range of this String. The text range begins at the specified beginIndex and extends to the char at index endIndex - 1. Thus the length (in chars) of the text range is endIndex-beginIndex. Unpaired surrogates within the text range count as one code point each.

	public static void main(String[] args) {
		String s="Code Point";
		System.out.println("Welcome To String Code Point Count");
		System.out.println(s.codePointCount(2, 5));
		codePointCount​(2,5);
	}
	
	public static int codePointCount​(int beginIndex, int endIndex) {
		System.out.println("The BeginIndex is " + beginIndex);
		System.out.println("The EndIndex is " + endIndex);
		return 0;	
	}
}
