package com.stringExamples;
import java.util.Scanner;
public class ChangeCharCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the paragraph:");
		String str=sc.nextLine();
		StringBuilder newStr = new StringBuilder(str);
		for(int i=0;i<str.length();i++) {
			if(Character.isLowerCase(str.charAt(i)) ){
				 newStr.setCharAt(i, Character.toUpperCase(str.charAt(i))); 
			}
			else if(Character.isUpperCase(str.charAt(i))) {
				 newStr.setCharAt(i, Character.toLowerCase(str.charAt(i)));
			}
		}
		System.out.println(newStr);
		sc.close();

	}

}
