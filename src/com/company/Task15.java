package com.company;

import java.util.Random;

public class Task15 {
    public static void main(String[] args) {
        Random random=new Random();
        int number=random.nextInt();
        boolean isOdd;
        isOdd= number % 2 != 0;
        System.out.println(" "+number+","+isOdd);
    }
}
