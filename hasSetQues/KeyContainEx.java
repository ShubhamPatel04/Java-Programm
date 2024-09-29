package com.hasSetQues;

	import java.util.HashMap;

		public class KeyContainEx {
		    public static void main(String[] args) {
		        HashMap<String, Integer> map = new HashMap<>();

		        if (map.isEmpty()) {
		            System.out.println("The HashMap is empty.");
		        } else {
		            System.out.println("The HashMap contains key-value mappings.");
		        }
		        map.put("Alice", 30);
		        map.put("Bob", 25);

		        if (map.isEmpty()) {
		            System.out.println("The HashMap is empty.");
		        } else {
		            System.out.println("The HashMap contains key-value mappings.");
		        }
		    }
		}
