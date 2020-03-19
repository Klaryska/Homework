package com.it.academy;

import java.util.Scanner;

public class AgeDiscounts {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your Age: ");
        int a = scanner.nextInt();
        if (a > 65) {
            System.out.println("Your discount: 10%");
        } else if (a < 18) {
            System.out.println("Your discount: 25%");
        } else {
            System.out.println("Your discount: 5%");
        }

    }
}