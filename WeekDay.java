package com.it.academy;

import java.util.Scanner;

public class WeekDay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the number from 1 to 7");
        int a = scanner.nextInt();
        if (a == 1) {
            System.out.println("Monday");
        } else if (a == 2) {
            System.out.println("Thuesday");
        } else if (a == 3) {
            System.out.println("Wednesday");
        } else if (a == 4) {
            System.out.println("Thursday");
        } else if (a == 5) {
            System.out.println("Friday");
        } else if (a == 6) {
            System.out.println("Saturday");
        } else if (a == 7) {
            System.out.println("Sunday");
        } else {
        }
    }
}