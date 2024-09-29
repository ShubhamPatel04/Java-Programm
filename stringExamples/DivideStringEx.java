package com.stringExamples;

import java.util.Scanner;

public class DivideStringEx {

	    public static String[] divideString(String str, int n) {
	        int length = str.length();

	        if (length % n != 0) {
	            System.out.println("The string cannot be divided into " + n + " equal parts.");
	            return null;
	        }

	        String[] parts = new String[n];
	        int partLength = length / n;

	        for (int i = 0; i < n; i++) {
	            int si = i * partLength;
	            int ei = (i + 1) * partLength;
	            parts[i] = str.substring(si, ei);
	        }

	        return parts;
	    }

	    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String:");
        String str=sc.next();
        System.out.println("Enter the no for divide a String in equal parts:");
        int n=sc.nextInt();

	        String[] parts = divideString(str, n);

	        if (parts != null) {
	            for (String part : parts) {
	                System.out.println(part);
	            }
	        }
	        sc.close();
	    }
	}