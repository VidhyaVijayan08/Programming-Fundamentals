package com.chainsys.day2;

import java.util.Scanner;

public class Hospital {
	public static void main(String[] args) {
		
		int pid = 20;
		String pname;
		String bloodgroup;
		String hname;
		String branch;
		hname = "Apolo Hospital";
		
		System.out.println("*********************");
		System.out.println("Patient ID : " + pid);
		Scanner sc = new Scanner(System.in);
		System.out.println("*********************");
		System.out.println("Please Enter Patient Name :");
		pname = sc.nextLine();
		System.out.println("*********************");
		System.out.println("Please Enter Your Blood Group : ");
		bloodgroup = sc.nextLine();
		System.out.println("*********************");
		System.out.println("Please Enter Branch");
		branch = sc.nextLine();
		System.out.println("*********************");
		System.out.println("Patient Details");
		System.out.println("*********************");
		System.out.println("Patient Id : " +pid);
		System.out.println("*********************");
		System.out.println("Patient Name : " + pname);
		System.out.println("*********************");
		System.out.println("Patient Blood Group : " + bloodgroup);
		System.out.println("*********************");
		System.out.println("Hospital Name :  " + hname);
		System.out.println("*********************");
		System.out.println(" Branch : " + branch);
		System.out.println("*********************");
		
		Rest();
		
	}
	
	
	

	private static void Rest() {
		System.out.println("I am suffering from cold and fever");
		System.out.println("Please Wear Mask");
		
	}
}
