package Assignment2;

import java.util.Scanner;

public class NumberOfDays {
    public static void main(String[] args) {
        Scanner months = new Scanner(System.in);

        int days_in_month = 0;
        String month_name="";

        System.out.println("Input a month number:");
        int month_num = months.nextInt();
        System.out.println("Input a year:");
        int year= months.nextInt();

        switch (month_num) {
            case 1 :
                days_in_month = 31;
                month_name= "January";
                break;
            case 2:
                days_in_month = 29;
                month_name="February";

                break;
            case 3:
                days_in_month = 30;
                month_name= "March";
                break;
            case 4:
                days_in_month = 31;
                month_name= "April";
                break;
            case 5:
                days_in_month = 30;
                month_name= "May";
                break;
            case 6:
                days_in_month = 31;
                month_name= "June";
                break;
            case 7:
                days_in_month = 30;
                month_name= "July";
                break;
            case 8:
                days_in_month = 31;
                month_name= "August";
                break;
            case 9:
                days_in_month = 30;
                month_name= "September";
                break;
            case 10:
                days_in_month = 31;
                month_name= "October";
                break;
            case 11:
                days_in_month=30;
                month_name= "November";
            case 12:
                days_in_month = 31;
                month_name= "December";
                break;
            default :

                System.out.println("INVALID MONTH");

        }
        System.out.println(month_name + " " + year + " has " + days_in_month + " days");
    }
}

