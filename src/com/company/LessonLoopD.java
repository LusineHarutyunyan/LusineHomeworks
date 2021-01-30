package com.company;
import java.util.Scanner;

public class LessonLoopD {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        int A=scanner.nextInt();
        int B=scanner.nextInt();

        int sum = 0;

        for (int i = A; i <= B; i++) {
            sum += i;
        }

        System.out.println("Sum is " + sum);
    }
}
