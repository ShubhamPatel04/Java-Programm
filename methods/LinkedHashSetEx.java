package com.methods;

import java.util.*;
public class LinkedHashSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
//			        LinkedHashSet<String> li=new LinkedHashSet();  
//			               li.add("One");    
//			               li.add("Two");    
//			              li.add("Three");   
//			               li.add("Four");  
//			               li.add("Five");  
			        
//			        li.add("Shubham");
//			        li.add("Shivam");
//			        li.add("Rahul");
//			        li.add("Akash");
//			        li.add("Vishal");
//			        li.add("Pawan");	 
		
		 LinkedHashSet<Integer> a=new LinkedHashSet(); 
			       a.add(100);
			       a.add(200);
			       a.add(300);
			       a.add(400);
			       a.add(500);
			       a.add(600);
			       
		 
			               Iterator<Integer> i=a.iterator();  
			               while(i.hasNext())  
			               {  
			               System.out.println(i.next());  
			               }  
			 }  
			

	}


