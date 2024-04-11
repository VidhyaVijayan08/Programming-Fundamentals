package com.chainsys.day5;

import java.util.regex.*;  
class Regex{  
public static void main(String args[]){  
	
	System.out.println(Pattern.matches("[a-z A-Z 0-9]{6}", "arun32"));//true  
	System.out.println(Pattern.matches("[a-z A-Z 0-9]{6}", "kkvarun32"));//false (more than 6 char)  
	System.out.println(Pattern.matches("[a-z A-Z 0-9]{6}", "JA2Uk2"));//true  
	System.out.println(Pattern.matches("[a-z A-Z 0-9]{6}", "arun$2"));//false ($ is not matched)
	
	String str = "bbb";
	System.out.println("Using String matches method: "+str.matches(".bb"));//True
	System.out.println("Using Pattern matches method: "+Pattern.matches(".bb", str));//True
	}
}  
