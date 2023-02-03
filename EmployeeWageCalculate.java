package com.bridglabz;

import java.lang.*;
public class EmployeeWageCalculate {
    int wagePerHour;
    int fullDayHour;

    public static void main(String[] args) {
        EmployeeWageCalculate dailyWage=new EmployeeWageCalculate();
        dailyWage.wagePerHour=20;
        dailyWage.fullDayHour=8;

        int calculate=(int)(dailyWage.wagePerHour*dailyWage.fullDayHour);
        System.out.println("The daily employee wage is :" +calculate);
    }
}
