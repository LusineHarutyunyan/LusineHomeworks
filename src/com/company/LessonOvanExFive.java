package com.company;

import java.util.Scanner;

public class LessonOvanExFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y;
        if (x > 0) {
            y = 2 * x - 1;

        } else if (x == 0) {
            y = 0;
        } else {
            y = 3 * (-2 * x) - 5;
        }
        System.out.println(y);
    }
}
