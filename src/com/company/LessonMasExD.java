package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class LessonMasExD {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int price = scanner.nextInt();
        int array[] = new int[10];

        int indicator = 0;
        for (int i = 2; i <= 10; i += 2) {
            array[indicator] = i * price;
            indicator++;
        }

        System.out.println("N is " + indicator);
        System.out.println("Array is " + Arrays.toString(array));
    }
}

