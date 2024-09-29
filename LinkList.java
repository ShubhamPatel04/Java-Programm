package com.arraylist;
import java.util.*;
import java.util.LinkedList;
public class LinkList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer>a=new LinkedList();
		
		a.add(100);
		a.addFirst(200);
		a.addLast(300);
		a.addLast(700);
		a.add(2, 500);
		a.sort(null);
		System.out.println(a);
		
		System.out.println(a);
		
		a.removeFirst();
		System.out.println(a);
		
		a.removeLast();
		System.out.println(a);
		a.clear();
		
		a.replaceAll(null);
		System.out.println(a);
		
	}
}
