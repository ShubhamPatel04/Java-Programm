package com.array;
import java.util.*;
public class SubArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n=sc.nextInt();
		int[] arr= new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter the element in an Array at index:"+i);
			 arr[i]=sc.nextInt();
		}
		
		System.out.println("Choose the start index of the array:");
		int a=sc.nextInt();
		System.out.println("Choose the last index of the array:");
		int b=sc.nextInt();
		System.out.print("The array elements are: ");
        for (int i = a; i <=b; i++) {
        	Arrays.sort(arr);

        }
        
        System.out.println(Arrays.toString(arr) + " ");
     System.out.print("Second Largest no is:");
        System.out.println(arr.length-1);
        
        sc.close();
	}

	}

