package com.it.academy;
import java.util.Scanner;
public class CircleDimensions {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius = 7.5;
        double area = Math.PI * (radius * radius);
        double perimeter= Math.PI * 2*radius;
        System.out.println( "Perimeter is = "+perimeter) ;
        System.out.println("Area is = " + area);
    }
}