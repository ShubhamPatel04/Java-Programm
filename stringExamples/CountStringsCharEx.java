package com.stringExamples;

import java.util.Scanner;
public class CountStringsCharEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the Sentence:");
      String str=sc.nextLine();
      int count=0;
      
      for(int i=0;i<str.length();i++) {
    	  if(str.charAt(i)!=' ') {
    		  count++;
    	  }
      }
      System.out.println("The total character in the sentence is:"+count);
      sc.close();
	}

}
