package com.HashSetQue;

import java.util.*;

	public class StackEx {
	    public static void main(String[] args) {
	        Stack<Integer> stack = new Stack<>();

	        for (int i = 1; i <= 10; i++) {
	            stack.push(i);
	        }

	        System.out.println("Stack after adding 10 elements: " + stack);

	        for (int i = 0; i < 4; i++) {
	            if (!stack.isEmpty()) {
	                Integer removedElement = stack.pop();
	                System.out.println("Removed element: " + removedElement);
	            }
	        }

	        System.out.println("Stack after removing 4 elements: " + stack);
	    }
	}