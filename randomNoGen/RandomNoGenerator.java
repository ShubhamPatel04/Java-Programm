package com.randomNoGen;
import java.util.*;
public class RandomNoGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the minimum no:");
		int min = sc.nextInt();
		System.out.println("Enter the maximum no:");
		int max = sc.nextInt();
		
		System.out.println("Random value is "+min+" to "+max);  
		double a = Math.random()*(max-min+1)+min;   
		System.out.println(a);  
		
		System.out.println("Random value of type int between "+min+" to "+max);  
		int b = (int)(Math.random()*(max-min+1)+min);  
		System.out.println(b);  
		sc.close();
		}  
		}  