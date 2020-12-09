package com.company;

import java.util.Scanner;

public class LessonTwoExTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x > 0) {
            System.out.println(2 * x - 10);

        } else if (x == 0) {
            System.out.println(0);

        } else {
            System.out.println(-2 * x - 1);
        }

    }
}
