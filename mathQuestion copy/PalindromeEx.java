package com.mathQuestion;

import java.util.Scanner;
public class PalindromeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     int sum=0;
     int num;
     int temp;
     System.out.println("Enter the no:");
     int n=sc.nextInt();
     
     temp=n;    
     while(n>0){    
      num=n%10;  
      sum=(sum*10)+num;    
      n=n/10;    
     }    
     if(temp==sum)    
      System.out.println("The given number is palindrome number ");    
     else    
      System.out.println("The given number is not palindrome");    
     sc.close();
   }  
   }  
