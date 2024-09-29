package com.hashMap;

import java.util.HashMap;

public class HashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		HashMap<Integer, String> hm=new HashMap<Integer, String>();
//		hm.put(1, "Shubham");
//		hm.put(2, "Vishal");
//		hm.put(3, null);
		//hm.clear();  //Remove all data from map
		
		
		//Clone data
//		HashMap<Integer ,String> h1=(HashMap<Integer ,String>)hm.clone();
//		System.out.println(h1);
		
		
		//check the value if present in map then it return true otherwise false
		//System.out.println(hm.containsKey(1)); 

		//check the object if present in map then it return true otherwise false
		//System.out.println(hm.containsValue("Shubham"));
		
		
		//It is used to return a collection view of the mappings contained in this map
		//System.out.println(hm.entrySet());
		
		//It is used to return the object of the value
		//System.out.println(hm.get(1));
		
		/*It returns the value to which the specified key is mapped,
		or defaultValue if the map contains no mapping for the key.*/
		//System.out.println(hm.getOrDefault(null, "Vishal"));
		
		//It replaces the specified value for a specified key.
//		hm.replace(3, "Pawan");
//		System.out.println(hm);
		
		//check map is empty or not and return T/F.
		//System.out.println(hm.isEmpty());
		
		//display all key values
	//System.out.println(hm.keySet());
		
		//Remove data from map
//		hm.remove(3);
//		System.out.println(hm);
		
		
	//	System.out.println(hm.size());
		
		//Display the object of the map
		//System.out.println(hm.values());
		
		
		HashMap<String, Double> b=new HashMap<String, Double>();
		b.put("Hindi", 1300.00);
		b.put("English", 1500.00);
		b.put("Operating Science", 1459.00);
		b.put("Computer Network", 1000.00);
		System.out.println(b.values());
	//	System.out.println(b.getClass());
		//System.out.println(b.entrySet());
		
	}

}
