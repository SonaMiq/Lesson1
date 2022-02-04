package com.company;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Insert right-angle triangle leg1");
        int leg1=scanner.nextInt();
        System.out.println("Insert right-angle triangle leg2");
        int leg2=scanner.nextInt();
        System.out.println("area= "+(double)leg1*leg2/2);
        System.out.println("Insert square side");
        int side= scanner.nextInt();
        System.out.println("area= "+side*side);
        System.out.println("Insert rectangle length");
        int length= scanner.nextInt();
        System.out.println("Insert rectangle width");
        int width= scanner.nextInt();
        System.out.println("area= "+length*width);
    }
}
