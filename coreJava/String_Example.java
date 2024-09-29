package com.coreJava;

public class String_Example {

	    public static void main(String[] args) {
	        String sentence = "This is a sample sentence.";

	        // Length of the string
	        int length = sentence.length();
	        System.out.println("Length of the sentence: " + length);

	        // Substring extraction
	        String substring = sentence.substring(10, 15);
	        System.out.println("Substring: " + substring);

	        // Checking for a substring
	        boolean contains = sentence.contains("sample");
	        System.out.println("Contains \"sample\": " + contains);

	        // Joining strings with a delimiter
	        String[] words = sentence.split(" ");
	        String joinedSentence = String.join("-", words);
	        System.out.println("Joined sentence: " + joinedSentence);

	        // Finding the index of a character
	        int indexOf = sentence.indexOf('s');
	        System.out.println("Index of 's': " + indexOf);
	    }
	}