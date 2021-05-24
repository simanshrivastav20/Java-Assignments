package Assignment2;

import java.util.Scanner;

public class MonthsAndDays {
    public static void main(String[] args) {
        Scanner months = new Scanner(System.in);

        int days_in_month = 0;

        System.out.println("What month do you want to know?");
        String month_name = months.next();
        switch (month_name) {
            case "January":
                days_in_month = 31;
                break;
            case "February":
                days_in_month = 29;
                break;
            case "March":
                days_in_month = 30;
                break;
            case "April":
                days_in_month = 31;
                break;
            case "May":
                days_in_month = 31;
                break;
            case "June":
                days_in_month = 31;
                break;
            case "July":
                days_in_month = 31;
                break;
            case "August":
                days_in_month = 31;
                break;
            case "September":
                days_in_month = 31;
                break;
            case "October":
                days_in_month = 31;
                break;
            case "November":
                days_in_month = 31;
                break;
            case "December":
                days_in_month = 31;
                break;
            default :
                System.out.println("INVALID MONTH");

        }



        System.out.println(month_name + " has " + days_in_month + " days");
    }
}
