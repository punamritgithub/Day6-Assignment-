package com.brigelagz;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner scn = new Scanner(System.in);
         int num = scn.nextInt();
         int Reverse=0;
         while(num!=0) {
             int Reminder = num % 10;
             Reverse = Reverse * 10 + Reminder;
             num = num / 10;
         }
        System.out.println("Reverse of the is" +Reverse);

    }
}
