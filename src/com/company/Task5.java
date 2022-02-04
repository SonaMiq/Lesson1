package com.company;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Insert number1");
        int num1=sc.nextInt();
        System.out.println("Insert number2");
        int num2=sc.nextInt();
        System.out.println("Insert number3");
        int num3=sc.nextInt();
        System.out.println((double)(num1+num2+num3)/3);
    }
}
