package com.company;

import java.util.Scanner;

public class LessonOneExOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
}
