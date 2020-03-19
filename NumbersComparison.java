package com.it.academy;

import java.util.Scanner;

public class NumbersComparison {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number: ");
        int a = scanner.nextInt();
        System.out.println("Input second number: ");
        int b = scanner.nextInt();
        if (a > b) {
            System.out.printf("%d > %d\n", a, b);
        } else if (a < b) {
            System.out.printf("%d < %d\n", a, b);
        } else {
            System.out.printf("%d = %d\n", a, b);
        }

    }
}