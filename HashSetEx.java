package com.arraylist;

import java.util.*;
import java.util.HashSet;
public class HashSetEx {

		public static void main(String[] args) {
		HashSet h1=new HashSet(100);	
		// add
		//h1.add('A');
		h1.add(200);
		//h1.add(null);
		h1.add(500);
		h1.add(100);
		h1.add(300);
	   
		
		h1.remove(300);
		h1.add('A');
		
		System.out.println(h1);
		System.out.println(h1.contains('S'));
		h1.clear();
		ArrayList<Integer> a1=new ArrayList<Integer>(h1);
		System.out.println(a1);
		a1.add(20);
		
		Collections.sort(a1);
		System.out.println(a1);
		
		}
	}
