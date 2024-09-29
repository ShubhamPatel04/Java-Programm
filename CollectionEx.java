package com.collection;

	import java.util.*;  
	class Test<T,U>{  
//	public static void main(String args[]){ 
//		
//	ArrayList<String> list=new ArrayList<String>(); 
//	list.add("Shivam"); 
//	list.add("Rahul");  
//	list.add("Akash");  
//	list.add("Shivam");  
//	
//	Iterator itr=list.iterator();  
//	
//	while(itr.hasNext()){  
//	System.out.println(itr.next());  
//	}  
//	}  
		T obj1;
		U obj2;
		
		Test(T obj1,U obj2){
			this.obj1=obj1;
			this.obj2=obj2;
		}
		
		public void print() {
			System.out.println(obj1);
			System.out.println(obj2);
		}
	}  
	public class CollectionEx{
		public static void main(String[] args) {
			Test<Integer,String> iobj=new Test<Integer,String>(15,"Welcome");
			System.out.println("Printing Data");
			iobj.print();
		}
	}