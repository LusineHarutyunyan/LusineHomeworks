package com.company;

import java.util.Scanner;

public class LessonTwoExOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        double d = b * b - 4 * a * c;
        double x1 = ( -b + Math.sqrt(d) )/ (2 * a);
        double x2 = (-b - Math.sqrt(d)) /(2 * a);
        System.out.println(x1);
        System.out.println(x2);

    }

}
