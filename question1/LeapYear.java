package com.question1;


import java.util.Scanner;
public class LeapYear {
	public void checkLeapYear(int n) {
		if (n % 4 == 0) {
			 if (n % 100 == 0) {
				 if (n % 400 == 0) {
					 System.out.println(n + " is a leap year.");	 
				 }
				 else {
					 System.out.println(n + " is not a leap year.");
				 }
			 }
				 else {
					 System.out.println(n + " is a leap year.");
				 }
			 }
		else {
			System.out.println(n + " is not a leap year.");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the year to check given no is leap year or not:");
		 int n = sc.nextInt();
		 sc.close();
		 LeapYear leapYear = new LeapYear();
		 leapYear.checkLeapYear(n);

	}

}
