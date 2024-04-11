package com.chainsys.day3;

public class Company {
//	A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
//	Ask user for their salary and year of service and print the net bonus amount.
	
	public static void main(String[] args) {
		int years =6;
		int bonus =5;
		int salary =10000;
		
		if(years>=5) {
			salary = salary+((salary*5)/100); 
			System.out.println(salary);
		}else {
			System.out.println("Error");//Validation
		}
	}
}
