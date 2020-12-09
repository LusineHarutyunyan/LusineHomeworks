package com.company;

import java.util.Scanner;

public class LessonOneExFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x > 0) {
            x = x * 2;

        } else if (x < 0) {
            x = x * 3;

        } else {
            x = 10;
        }
        System.out.println(x);


    }
}
