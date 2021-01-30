package com.company;
import java.util.Scanner;

public class LessonNowArrayExE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;

        do {
            System.out.println("Enter size");
            size = scanner.nextInt();
        } while (size < 1 || size > 10);

        System.out.println("Size set successfully");
        System.out.println("Now enter the values");
        int[] arr = new int[10];
        for (int i =0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] newArr = new int[10];
        int newArrayIndexIterator = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 == 0) {
                newArr[newArrayIndexIterator++] = arr[i];
            }
        }

        for (int i = 0; i < newArrayIndexIterator; i++) {
            System.out.println("Index of " + i + "value is " + newArr[i]);
        }
    }
}
