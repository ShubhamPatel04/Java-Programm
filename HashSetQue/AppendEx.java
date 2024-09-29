package com.HashSetQue;

import java.util.HashSet;

	public class AppendEx {
	    public static void main(String[] args) {
	        HashSet<String> set = new HashSet<>();

	        set.add("Apple");
	        set.add("Banana");
	        set.add("Orange");

	        System.out.println("Before add element:" + set);

	        String elementToAdd = "Grapes";

	        set.add(elementToAdd);

	        System.out.println("After adding element:" + set);
	    }
	}