package com.mathQuestion;

import java.util.Scanner;
public class FactorialNoEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a no:");
       int n=sc.nextInt();
       int fact=1;
       for(int i=n;i>0;i--) {
    	   fact=fact*i;
       }
       System.out.println("Factorial of the given no is:"+fact);
       sc.close();
	}

}
