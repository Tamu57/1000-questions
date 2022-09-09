package Basics_11;

import java.util.Scanner;

//  Write a Java program that takes two numbers as input and display the product of two numbers.
public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number : ");
        int num2 = scanner.nextInt();
        System.out.println("the sum of "+num1+" and "+ num2 + " is " + (num1+num2));
    }
}
