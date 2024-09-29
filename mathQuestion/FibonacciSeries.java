package com.mathQuestion;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the for Febonacci Series:");
		int num=sc.nextInt();
		int num1=0;
		int num2=1;
		int series=0;
		int sum=1;
		System.out.print("Febonacci series is:"+num1+","+num2);
		for(int i=2;i<=num;i++) {
			series=num1+num2;
			System.out.print(","+series);
			num1=num2;
			num2=series;
			sum=sum+series;
			
		}
		System.out.println();
		System.out.println("Sum of Febonacci Series is:"+sum);
		sc.close();
	}

}
