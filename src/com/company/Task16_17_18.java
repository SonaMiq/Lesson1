package com.company;


import java.util.Scanner;

public class Task16_17_18 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int number= sc.nextInt();
        System.out.println(number/10%10);
        System.out.println(number/100);
        System.out.println(number/100+number/10%10+number%10);
    }
}
