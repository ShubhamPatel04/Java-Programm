package com.stringExamples;

import java.util.Scanner;

public class ReplaceSpace {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Paragraph:");
			String str=sc.nextLine();
			for(int i=0;i<str.length();i++) {
					str=str.replaceAll("\\s", "_");	
					}
			System.out.println(str);
			sc.close();
		}

	}
