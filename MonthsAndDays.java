package Assignment2;

import java.util.Scanner;

public class MonthsAndDays {
    public static void main(String[] args) {
        Scanner months = new Scanner(System.in);

        int days_in_month = 0;

        System.out.println("What month do you want to know?");
        String month_name = months.next();
        switch (month_name) {
            case "Janaury":
                days_in_month = 31;
                break;
        }
        switch (month_name) {
            case "Febraury":
                days_in_month = 29;
                break;
        }
        switch (month_name) {
            case "March":
                days_in_month = 30;
                break;

        }
        switch (month_name) {
            case "April":
                days_in_month = 31;
                break;
        }
        switch (month_name) {
            case "May":
                days_in_month = 30;
                break;
        }
        switch (month_name) {
            case "June":
                days_in_month = 31;
                break;}
        switch (month_name) {
            case "July":
                days_in_month = 30;
                break;
        }
        switch (month_name) {
            case "August":
                days_in_month = 31;
                break;
        }
        switch (month_name) {
            case "September":
                days_in_month = 30;
                break;}
        switch (month_name) {
            case "October":
                days_in_month = 31;
                break;
        }
        switch (month_name) {
            case "November":
                days_in_month = 30;
                break;
        }
        switch (month_name) {
            case "December":
                days_in_month = 31;
                break;
        }


        System.out.println(month_name + " has " + days_in_month + " days");
//        default :
//        System.out.println("INVALID MONTH");

    }
}
