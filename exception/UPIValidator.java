package com.exception;

import java.util.Scanner;

class UserDefinedException extends Exception {
    public UserDefinedException(String msg) {
        super(msg);
    }
}

public class UPIValidator { 
    public static void validate(String id, String userId) throws UserDefinedException {
        if (!id.equals(userId)) { 
            throw new UserDefinedException("Your UPI id did not match.");
        } else {
            System.out.println("UPI id match.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your UPI id:");
        String userId = sc.next();
        String expectedId = "shubham@123";  
        
        try {
            validate(userId, expectedId);
        } catch (UserDefinedException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}