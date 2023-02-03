package com.bridglabz;

import java.lang.*;
public class EmployeeWagePartTime {
    int wagePerHour;
    int fullDayHour;
    int partTimeHour;

    public static void main(String[] args) {
        EmployeeWagePartTime dailyWage = new EmployeeWagePartTime();
        EmployeeWagePartTime partTime = new EmployeeWagePartTime();

        dailyWage.wagePerHour = 20;
        dailyWage.fullDayHour=16;

        partTime.partTimeHour=8;

        int calculate = (int)(dailyWage.wagePerHour * dailyWage.fullDayHour);
        System.out.println("The full time employee wage is :"+calculate+"rs");

        calculate = (int)(dailyWage.wagePerHour * partTime.partTimeHour);
        System.out.println("The part time employee wage is :"+calculate+"rs");
    }
}
