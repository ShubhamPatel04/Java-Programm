package com.exceptionHanding;

import java.util.Scanner;
public class ArrayExceptionEx {
	    public static void main(String[] args) {
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("Enter the size of the Array:");
	    	int n=sc.nextInt();
	    	int[] arr=new int[n];
	    	for(int i=0;i<n;i++) {
	    		System.out.println("Enter the element of Index "+i);	
	    		arr[i]=sc.nextInt();
	    	}
	    	
	    		for (int j = 0; j <= arr.length; j++) {
	            System.out.println(arr[j]);
	        
	    	}
	    		sc.close();
	    }
	}
