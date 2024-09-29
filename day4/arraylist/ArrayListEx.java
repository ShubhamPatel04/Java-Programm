package com.arraylist;
import java.util.ArrayList;
public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a1=new ArrayList();
		a1.add(100);
		a1.add("Shubham");
		a1.add(true);
		a1.add(2.7);
		a1.add('A');
		a1.add(null);
		a1.addFirst(200);
		a1.addLast(500);
		a1.removeFirst();
		a1.removeLast();
		System.out.println(a1);

	}

}
