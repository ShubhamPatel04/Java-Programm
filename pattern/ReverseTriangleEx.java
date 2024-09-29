package com.pattern;

import java.util.Scanner;
public class ReverseTriangleEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of the row");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for (int j=0; j<n; j--)         
			{  
			     
			System.out.print(" ");   
			}   
			
			for (int k=0; k<n; k++ )   
			{   
			     
			System.out.print("* ");   
			}  
			System.out.println();
		}
		
		sc.close();

	}

}
