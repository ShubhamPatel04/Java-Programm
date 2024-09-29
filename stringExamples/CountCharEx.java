package com.stringExamples;

import java.util.Scanner;
public class CountCharEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a String:");
       String str=sc.next();
       int count=0;
       for(int i=0;i<str.length();i++) {
    	   count++;
       }
       System.out.println("Total character:"+count);
       sc.close();
	}

}
