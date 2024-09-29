package com.string;

import java.util.*;
public class Unique_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.nextLine();
		HashSet<Character> unique=new HashSet<>();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(unique.contains(ch)==true) 
				unique.remove(ch);
		
			else 
				unique.add(ch);
			
			if(unique.size()==0)
				System.out.println("The unique string are:");
			for(Character chh:unique)
				System.out.println(chh);
			
		}

	}

}
