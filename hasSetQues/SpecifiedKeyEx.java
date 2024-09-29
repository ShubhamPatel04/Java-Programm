package com.hasSetQues;

	import java.util.HashMap;

	public class SpecifiedKeyEx {
	    public static void main(String[] args) {
	        HashMap<String, Integer> map = new HashMap<>();

	        String key = "Alice";
	        Integer value = 30;

	        map.put(key, value);

	        System.out.println("HashMap contents: " + map);

	        map.put("Bob", 25);

	        System.out.println("Updated HashMap contents: " + map);
	    }
	}