package com.generics;

public class GenericsEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		printData(123);
//		printData("Shubham");
//		printData(400.00);
		
		
		printData(123);
		printData(400.00);
//		printData("Shubham"); //Can'nt be accesss

	}
//	//Use Generics
//	static<E> void printData(E data){
//		System.out.println(data);
	
	//Use Bounded Generics
	static<E extends Number> void printData(E data){
		System.out.println(data);
	}

}
