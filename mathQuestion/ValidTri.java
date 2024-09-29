package com.mathQuestion;

import java.util.Scanner;

public class ValidTri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of x(positive integer):");
	int x=sc.nextInt();
	System.out.println("Enter the value of Y(positive integer):");
	int y=sc.nextInt();
	System.out.println("Enter the value of Z(positive integer):");
	int z=sc.nextInt();
	
	if(x+y>z && y+z>x && z+x>y) {
		System.out.println("valid");
		if(x == y && y ==z) {
				System.out.println("The given triangle is Equivalent");
		      }
				else if (x ==y || y == z|| z == x ) {
				System.out.println("The given triangle is Isolation");
				    }
				else {
					System.out.println("The given triangle is Isolation");
				      }
	}
		
			else {
						System.out.println("invalid triangle");

					}
	sc.close();
	   }
	}
		
				

