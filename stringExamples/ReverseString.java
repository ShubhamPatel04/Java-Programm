package com.stringExamples;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String str=sc.nextLine();
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}
		sc.close();
	}

}
