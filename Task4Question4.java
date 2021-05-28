package Assignment4;

import java.util.Locale;

public class Task4Question4 {//a JAVA method to return a boolean true if the string doesn’t have repeating letters

    public static void main(String[] args) {
        String str1 = "Siman";
        String str2 = "Mathematics";


        System.out.println("For String: "+ str1);
        System.out.println(isRepeated(str1.toLowerCase()));
        System.out.println(str2);
        System.out.println("For String: "+ str2);
        System.out.println(isRepeated((str2.toLowerCase())));


//        String Low1 = str1.toLowerCase();
//        String Low2 = str2.toLowerCase();
//
//
//        System.out.println("False");
//        for (int i = 0; i < Low2.length(); i++) {
//            System.out.println(Low2.charAt(i));
//            for (int j = 0; j < Low2.length(); j++)
//                if (Low2.charAt(i) == Low2.charAt(j)) ;
//        }
//        System.out.println("True");

    }

    public static boolean isRepeated(String input) {
        for (int i = 0; i < input.length(); i++) {
            for (int j = i+1; j < input.length(); j++) {
                if (input.charAt(i) == input.charAt(j)) {

                    return false;
                }
            }
        }
        return true;
    }
}

