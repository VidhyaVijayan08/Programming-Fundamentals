package com.chainsys.day5;
import java.util.Scanner;

//cab fare
//Enter the km: 10
//Enter Cab Type : Prime
//
//Choose the cab type:
//* Micro ( Rs.10 per km )
//* Mini ( Rs.15 per km )
//* Prime (Rs.20 per km)
//
//Calculate the cab fare
//
//ECommerce Discount Calculation and Coupon Code
//* Get total bill : 3000
//Get the needed details from User.
//Discount Rules:
//* 2% discount for bill amount greater than 2000
//* 5% discount for bill amount greater than 5000
//Coupon Code:
//* COUP_2 means 2% discount on bill amount
//* COUP_5 means 5% discount on bill amount
public class CabFareAndDiscount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Calculate cab fare 
        System.out.println("Enter the km: ");
        double distance = scanner.nextDouble();
        System.out.println("Enter Cab type (Micro/Mini/Prime");
        String cabType = scanner.next();
        
        double farePerKm;
        switch(cabType.toLowerCase()) {
	        case "micro":
	        	farePerKm = 10;
	        	break;
	        case "mini":
	        	farePerKm = 15;
	        	break;
	        case "prime":
	        	farePerKm =20;
	        	break;
	        default:
	        	System.out.println("Invalid cab Type");
	        	return;
        }
        
        double totalFare = distance * farePerKm;
        System.out.println("Total fare: Rs." + totalFare);
        
        //Calculate discount
        System.out.println("Enter total bill amount: Rs.");
        double totalBill = scanner.nextDouble();
        double discount = 0;
        
        if(totalBill > 5000) {
        	discount = 0.05 * totalBill;
        }else if(totalBill > 2000) {
        	discount = 0.02 * totalBill;
        }

        System.out.println("Discount applied: Rs." + discount);
        double discountedAmount = totalBill - discount;

        // Apply coupon code
        System.out.print("Enter coupon code (COUP_2 or COUP_5): ");
        String couponCode = scanner.next();
        
        switch (couponCode) {
        	case "COUP_2":
	            discountedAmount -= (0.02 * totalBill);
	            break;
        	case "COUP_5":
	            discountedAmount -= (0.05 * totalBill);
	            break;
        	default:
	            System.out.println("Invalid coupon code.");
	            break;
        }

        System.out.println("Total bill after discount and coupon: Rs." + discountedAmount);

        scanner.close();
    }
}
