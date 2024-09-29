package com.mathQuestion;

import java.util.Scanner;
public class ArmstrongNoEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		 int res=0;
	     int num;
	     int temp;
		System.out.println("Enter number:");
		int n=sc.nextInt();
	    temp=n;
	     while(n>0) {
	    	 num=n%10;
	    	 res=(num*num*num)+res;
	    	 n=n/10;
	     }
	     System.out.println(res);
	     if(temp==res) {
	    	 System.out.println("The given no is Armstrong no:");
	     }
	     else {
	    	 System.out.println("The given no is not Armstrong no:");
	     }
         sc.close();
	}

}
