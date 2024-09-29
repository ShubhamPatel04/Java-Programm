package com.palindome;

	import java.util.Scanner;
	public class PalindromeString {

		public static void main(String[] args) {	
			// TODO Auto-generated method stub
	      Scanner sc=new Scanner(System.in);
	      System.out.println("Enter a String ");
	     String str=sc.nextLine();
	     StringBuilder reversedStr = new StringBuilder(str).reverse();
	      if (str.equalsIgnoreCase(reversedStr.toString())) {
	    	  System.out.println(str+"  is a Palindrome String.");
	      }
	      else {
	    	  System.out.println(str+"  is not a palindrome String.");
	      }
	      
	      sc.close();
		}

	}
