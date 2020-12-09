package com.company;

import java.util.Scanner;

public class LessonTwoExThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x > 0) {
            System.out.println(3 * x - 5);
        } else if (x == 0){
            System.out.println(0);
        }else {
            System.out.println(-x-1);
        }
    }
}
