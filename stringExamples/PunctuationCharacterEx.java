package com.stringExamples;

import java.util.Scanner;
public class PunctuationCharacterEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the paragraph:");
		String str=sc.nextLine();
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==','||str.charAt(i)=='.'||str.charAt(i)==';'||
					str.charAt(i)=='\'' ||str.charAt(i)=='\"'||str.charAt(i)=='{'||
					str.charAt(i)=='}'||str.charAt(i)=='?' ||str.charAt(i)=='!'||str.charAt(i)=='_'||
					str.charAt(i)=='('||str.charAt(i)==')'||str.charAt(i)==':') {
				count++;
				
			}
		}
		System.out.println("In the given Paragaraphs the total no of Panctuation Character is:"+count);
		sc.close();

	}

}
