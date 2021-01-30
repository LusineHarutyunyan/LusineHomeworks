package com.company;
import java.util.Scanner;

public class LesoonLoopE {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double price = scanner.nextDouble();
        for (int i=1 ; i<=10 ; i++){
            double kgprice = price * i;
            System.out.println("Price for " + i + "is " + kgprice);
        }
    }
}
