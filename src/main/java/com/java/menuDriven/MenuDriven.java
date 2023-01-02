package com.java.menuDriven;

import java.util.Scanner;

public class MenuDriven {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        int options;

        //Creating infinite while loop

        while(true) {

            // All Programs
            System.out.println("Select 1 For Generating Fibonacci Series");
            System.out.println("Select 2 For Checking The Prime Number or Not");
            System.out.println("Select 3 For Checking palindrome of a number or string");
            System.out.println("Select 4 To Exit");

            System.out.println("Make your choice : ");
            options = scanner.nextInt();

            //Creating switch case branch
            switch (options) {

                //Generating the fibonacci Series
                case 1:
                    fibonacci();
                    break;

                //Checking the Prime Number or not
                case 2:
                    Boolean result;
                    result = isPrime();
                    if (result){
                        System.out.println(" is a prime number.");
                    }else {
                        System.out.println(" is not a prime number.");
                    }
                    break;

                //Checking the Palindrome or not
                case 3:
                    Boolean res;
                    res = isPalindrome();
                    if (res){
                        System.out.println(" is a Palindrome");
                    }else {
                        System.out.println(" is not a Palindrome");
                    }
                    break;

                //Exit the program
                case 4:
                    System.exit(0);

                    //default case to display the message invalid choice made by the user
                default:
                    System.out.println("Invalid choice!!! Please make a valid choice.\n");
            }
        }
    }

    //function for finding palindrome for string or number
    public static Boolean isPalindrome(){
        String str;
        System.out.println("Enter the Number or String to check if it is a Palindrome or not : ");
        str = scanner.next();
        for (int i = 0; i < str.length(); i++) {
            int n = str.length();
            for (int k = 0; k < n / 2; k++) {
                if (str.charAt(k) != str.charAt(n - k - 1)) {
                    System.out.print(str);
                    return false;
                }
            }
        }
        System.out.print(str);
        return true;
    }
    //function for finding if the number is prime or not
    public static Boolean isPrime(){
        Integer num;
        System.out.println("Enter the number to check it is prime or not : ");
        num = scanner.nextInt();
        if (num < 2) {
            System.out.print(num);
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                System.out.print(num);
                return false;
            }
        }
        System.out.print(num);
        return true;
    }
    //function for finding fibonacci numbers for given range
    public static void fibonacci(){
        int low,high;
        System.out.println("Enter the first number ");
        low = scanner.nextInt();
        System.out.println("Enter the second number");
        high = scanner.nextInt();
        System.out.print("Fibonacci series for given range is: ");
        for (int i = low; i <= high; i++) {
            if (isFibonacci(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static boolean isFibonacci(int n) {
        if (n == 0 || n == 1) {
            return true;
        }

        int a = 0;
        int b = 1;
        int c = a + b;
        while (c < n) {
            a = b;
            b = c;
            c = a + b;
        }

        return (c == n);
    }

}
