package com.company;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int lastDigit = num % 10;
        System.out.println(lastDigit);
    }
}
