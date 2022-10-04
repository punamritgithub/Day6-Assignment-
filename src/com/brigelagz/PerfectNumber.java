package com.brigelagz;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        long n;
        int sum=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num= scan.nextInt();
        int i=1;
        while (i<=num/2)
        {
            if(num%i==0)
            {
            sum=sum+i;
            }
            i++;
        }
       if(sum==num)
       {
           System.out.println(" is a perfect number: "+num);
       }
        else
        {
           System.out.println(" is not a perfect number: "+num);

        }

    }
}
