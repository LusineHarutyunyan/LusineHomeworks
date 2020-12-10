package com.company;

import java.util.Scanner;

public class LessonOneExThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x > 0) {
            x = x + 2;
        } else {
            x = x * 2;
        }
        System.out.println(x);

    }
}
