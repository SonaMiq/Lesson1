package com.company;

public class Task8 {
    public static void main(String[] args) {
        System.out.println(arithmeticSeq(10));
        System.out.println(arithmeticSeq(15));

    }

    public static int arithmeticSeq(int n) {
        return 3 * n * n - 12 * n;
    }
}
