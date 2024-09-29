package com.coreJava;
import java.util.Scanner;

      public class MaxNo {

	    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2=sc.nextInt();

        int maximum;
        if (num1 > num2) {
            maximum = num1;
        } else {
            maximum = num2;
        }

        System.out.println("The maximum number is: " + maximum);
    }
}
      


