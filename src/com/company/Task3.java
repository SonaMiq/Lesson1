package com.company;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sumOfOdd=0;
        int sumOfEven=0;
        int oddCount=0;
        int evenCount=0;
        int number=0;
        while (oddCount!=4||evenCount!=4) {
            number=sc.nextInt();
            if(number%2==0){
                evenCount++;
                sumOfEven+=number;
            }
            else {
                oddCount++;
                sumOfOdd+=number;
            }
        }
        System.out.println("Sum off even= "+sumOfEven+",Sum of odd= "+sumOfOdd);
    }
}

