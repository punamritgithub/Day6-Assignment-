package com.brigelagz;

public class FibonacciNumber {
    public static void main(String[] args) {
        int n1=0;
        int n2=1;
        int i=2;
       int count=10;
       System.out.println(n1+"");
        System.out.println(n2+"");
       for( i=2;i<count;i++)
       {
           int n3=n1+n2;
           System.out.println(""+n3);
           n1=n2;
           n2=n3;
       }


    }

}
