package com.question1;

import java.util.Scanner;
public class StrongNo {

	public static int fact(int num) {
		int fact = 1;
		for (int i=1; i<=num; i++) {
			 fact = fact*i;
		}
			 return fact;
		}
	public static boolean strongNo(int number) {
		int a=number;
		 int sumOfFact= 0;
		 while (number > 0) {
			 int digit = number % 10;
			 sumOfFact =sumOfFact+ fact(digit);
			 number /= 10;
		 }
		 return sumOfFact == a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the no fo check the given no is strong or not:");
		int n=sc.nextInt();
		if(strongNo(n)) {
			System.out.println("Given no is strong no:");
		}
		else {
			System.out.println("Given no is not strong no:");
		}
		
		 sc.close();
	}

}
