package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class LessonMasExA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        if (A >= B) {
            System.out.println("sxal mutqagrum");
            return;
        }
        int array[] = new int[B];

        int indicator = 0;
        for (int i = B - 1; i > A; i--) {
            array[indicator] = i;
            indicator++;
        }

        System.out.println("N is " + indicator );
        System.out.println("Array is " + Arrays.toString(array));

    }
}
