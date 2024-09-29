package com.exceptionHanding;

public class ArrayElementException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int[] n = new int[100];

	        for (int i = 0; i < n.length; i++) {
	            n[i] = i + 1;
	        }

	        for (int i = 0; i <= n.length; i++) {
	            System.out.print(n[i] + " ");
	        }
	    }
	}