package com.company;

public class LessonThreeExA {
    public static void main(String[] args) {
        int A = 7;
        int B = 17;
        int count = 0;

        for (int i = B - 1; i > A; i--) {
            count++;
            System.out.printf(i + " ");
        }
        System.out.println();
        System.out.println("count= " + count);
    }
}

