package com.brigelagz;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int n;
        int count = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = scan.nextInt();
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("prime number");
        }
        else
        {
            System.out.println(" Not prime number");
        }

    }
}
