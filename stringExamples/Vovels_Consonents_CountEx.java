package com.stringExamples;

import java.util.Scanner;
public class Vovels_Consonents_CountEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the paragraphs:");
		String str=sc.nextLine();
		str=str.toLowerCase();
		int vcount=0;
		int ccount=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||
					str.charAt(i)=='o'||str.charAt(i)=='u') {
				vcount++;
			}
			else if(str.charAt(i)>='a'&&str.charAt(i)<='z') {
				ccount++;
			}
		
		}
		System.out.println("The total no of the Vouvels is"+vcount);
		System.out.println("The total no of the consonents is:"+ccount);
       sc.close();
	}

}
