package com.company;

public class Task2 {
    public static void main(String[] args) {

        System.out.println(minuteToHour(156));
    }

    /**
     *
     * @param minute
     * @return count of hours in minute
     */
    public static String minuteToHour(int minute){

        int hour=minute/60;
        int otherMinutes=minute%60;
        return hour+ "hour "+" "+otherMinutes+" minute";
    }
}
