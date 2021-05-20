package Assignment;

import java.util.Scanner;

public class UserOption {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter 1 for addition \n Enter 2 for Sub \n Enter 3 for Division \n Enter 4 for multiplication" +
                "\n Enter 5 for Average");
        int userOption = userInput.nextInt();
        while (userOption<=5){
            //Ask user to enter the 2 numbers in a variable for first and second(first and second are variable names) for the first 4 options mentioned above and print the result.
            if(userOption == 1) {
                System.out.println("Enter 1st number");
                int firstNumber = userInput.nextInt();
                System.out.println("Enter 2nd Number");
                int secondNumber = userInput.nextInt();

                System.out.println("Your value " + (firstNumber + secondNumber));
                if ((firstNumber + secondNumber)<0){
                    //For Negetive number
                    System.out.println("Oops option 1 is returning the negative number");
                }
                break;
            }else if(userOption == 2){
                System.out.println("Enter 1st number");
                int firstNumber = userInput.nextInt();
                System.out.println("Enter 2nd Number");
                int secondNumber = userInput.nextInt();

                System.out.println("Your value " + (firstNumber - secondNumber));
                if ((firstNumber - secondNumber)<0){
                    System.out.println("Oops option 2 is returning the negative number");
                }
                break;
            }
            else if(userOption == 3){
                System.out.println("Enter 1st number");
                int firstNumber = userInput.nextInt();
                System.out.println("Enter 2nd Number");
                int secondNumber = userInput.nextInt();

                System.out.println("Your value " + (firstNumber / secondNumber));
                if ((firstNumber / secondNumber)<0){
                    //for negetive number
                    System.out.println("Oops option 3 is returning the negative number");
                }
                break;
            }
            else if(userOption == 4){
                System.out.println("Enter 1st number");
                int firstNumber = userInput.nextInt();
                System.out.println("Enter 2nd Number");
                int secondNumber = userInput.nextInt();

                System.out.println("Your value " + (firstNumber * secondNumber));
                if ((firstNumber * secondNumber)<0){
                    System.out.println("Oops option 4 is returning the negative number");
                }
                break;
            }
            //Ask user to enter two numbers as first1 and second2 for calculating the average as soon as user choose an option 5.
            else if(userOption == 5){
                System.out.println("Enter 1st number");
                int firstNumber = userInput.nextInt();
                System.out.println("Enter 2nd Number");
                int secondNumber = userInput.nextInt();

                System.out.println("Your value " + ((firstNumber + secondNumber)/2));
                if (((firstNumber + secondNumber)/2)<0){
                    System.out.println("Oops option 5 is returning the negative number");
                }
                break;
            }

        }

        }
    }

