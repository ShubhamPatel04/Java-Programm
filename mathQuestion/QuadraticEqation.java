package com.mathQuestion;

import java.util.*;
public class QuadraticEqation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a,b,c,D;
		//double num1,num2;
		System.out.println("Enter the value of a:");
		a=sc.nextInt();
		System.out.println("Enter the value of b");
		b=sc.nextInt();
		System.out.println("Enter the value of c");
		c=sc.nextInt();
		
		if(a!=0) {
			D=b*b-4*(a*c);
			if(D>0) {
				System.out.println("Roots are real:");
			}
			else if(D==0) {
				System.out.println("Roots are real & equal");
			}
			else {
				System.out.println("Roots are imaginary:");
			}
		}
		else {
			System.out.println("Its not a quadratic equation:");
			
		}
//		num1=(-b + Math.sqrt(Math.abs(D))) / (2 * a);
//		System.out.println(num1);
//		num2=(-b - Math.sqrt(Math.abs(D))) / (2 * a);
//		System.out.println(num2);
		sc.close();
	}

}