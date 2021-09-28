package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter a integer value");
        int userInput = input.nextInt();

        if (userInput == 0) {
            System.out.println("Undefined");
        }
        if (userInput % 2 == 0) {
            System.out.println("Number is even");
        } else System.out.println("Number is odd");
    }
}

