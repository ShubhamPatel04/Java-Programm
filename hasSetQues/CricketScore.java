package com.hasSetQues;

	import java.util.HashMap;
	import java.util.Map;
	import java.util.Scanner;

	public class CricketScore {
	    public static void main(String[] args) {
	        Map<String, Integer> c = new HashMap<>();

	        c.put("Virat Kohli", 12000);
	        c.put("Surya Kumar Yadav", 11953);
	        c.put("Rohit Sharma", 9000);
	        c.put("Rishab Pant", 9577);

	        System.out.println("Cricketer Scores: " + c);

	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter the cricketer name to search for their score: ");
	        String searchName = sc.nextLine();

	        if (c.containsKey(searchName)) {
	            Integer score = c.get(searchName);
	            System.out.println(searchName + "'s score is: " + score);
	        } else {
	            System.out.println("Cricketer not found.");
	        }
	        sc.close();
	    }
	}