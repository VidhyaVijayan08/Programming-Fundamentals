package com.chainsys.day4;

public class StringExample1 {
public static void main(String[] args) {
	String str = "abc";
	System.out.println(str);
	
	char data[] = {'a', 'b', 'c'};
    String str1 = new String(data);
    System.out.println(data);
    
    System.out.println("abc");
    String cde = "cde";
    System.out.println("abc" + cde);
    String c = "abc".substring(2,3);
    String d = cde.substring(1, 2);
    System.out.println(c);
    System.out.println(d);
}
}
