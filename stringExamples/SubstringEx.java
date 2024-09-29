package com.stringExamples;

import java.util.Scanner;

public class SubstringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String:");
        String str=sc.next();
        
        for(int i=0;i<str.length();i++) {
        	for(int j=i+1;j<=str.length();j++) {
        		if(str.charAt(i)!=' ') {
            		System.out.print(str.substring(i,j)+" ");
            	}
        		
        	}
        	
        }
        sc.close();
	}

}
