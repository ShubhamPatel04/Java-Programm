package com.company1;

	import java.util.HashMap;

	public class HAshMapExample {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
		 HashMap<Integer,String> hm=new HashMap<Integer,String>();
	    	   
		   hm.put(1,"Mango");  //Put elements in Map  
		   hm.put(2,"Apple");    
		   hm.put(3,"Banana");   
		   hm.put(4,"Grapes");  
		   
		   System.out.println(hm.get(1));
		   System.out.println(hm.get(3));
	       
		}

	}