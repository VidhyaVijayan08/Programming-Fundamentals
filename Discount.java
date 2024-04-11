package com.chainsys.day3;

import java.util.Scanner;

public class Discount {
//	A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
//	Ask user for quantity
//	Suppose, one unit will cost 100.
//	Judge and print total cost for user.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int quantity1,quantity2,quantity3,quantity4;
		System.out.println("Enter The Product Quantity ");
		quantity1=sc.nextInt();
		quantity2=sc.nextInt();
		quantity3=sc.nextInt();
		quantity4=sc.nextInt();
		
		int totalQuantity;
		double cost;
		double discount;
		totalQuantity = quantity1 + quantity2 + quantity3 + quantity4;
		System.out.println("Total quantity:" + totalQuantity);
		cost = totalQuantity *100;
		discount = (10*cost)/100;
		System.out.println(" The cost :" + cost);
		if(cost>0) {
			if(cost>1000) {
				System.out.println("We get Discount");
			}
			else {
				System.out.println("We are not eligible for Discount");
			}
		}else {
			System.out.println("Invalid Data");//Validation
		}
	}

}
