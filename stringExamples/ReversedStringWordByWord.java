package com.stringExamples;
import java.util.Scanner;
public class ReversedStringWordByWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String str=sc.nextLine();
		String newStr="";
		for(int i=str.length()-1;i>=0;i--) {
			newStr=newStr+str.charAt(i);
		}
		System.out.println(newStr);
		sc.close();
	}

}
