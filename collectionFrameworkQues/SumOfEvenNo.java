package com.collectionFrameworkQues;

import java.util.*;
public class SumOfEvenNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<Integer> l1=new ArrayList<>();
        l1.add(1);l1.add(1);
        l1.add(12);
        l1.add(4);
        l1.add(7);
        l1.add(8);
        l1.add(10);
        l1.add(13);
        l1.add(11);
        l1.add(19);
        l1.add(42);
        System.out.println(l1);
        
        System.out.print("Even Numbers: ");
        int sum=0;
        	for (Integer number : l1) {
        		if (number % 2 == 0) {
        			sum=sum+number;
        			System.out.print(number + " ");
            }
        }
        	
        	System.out.println("\n The sum of all even no is:"+sum);

	}
}
