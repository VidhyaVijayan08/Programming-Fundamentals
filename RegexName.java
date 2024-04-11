package com.chainsys.day5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexName {
	public static void main(String[] args) {
		String regex = "[a-z][A-Z]";
		System.out.println(Pattern.matches("[a-z A-Z]{6}", "Vidhya"));
		Pattern pattern = Pattern.compile(regex);
	}
}
