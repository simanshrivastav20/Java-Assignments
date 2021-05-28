package Assignment4;

import java.util.Locale;

public class Task4Question6 {// a JAVA program that swaps the case of the alphabets of the string

    public static void main(String[] args) {
        String str = "heLLo WOrLd";
        String t = "";
        for (int x = 0; x < str.length(); x++)
        {
            char c = str.charAt(x);
            boolean check = Character.isUpperCase(c);
            if (check == true)
                t = t + Character.toLowerCase(c);
            else
                t = t + Character.toUpperCase(c);
        }
        System.out.println (t);

    }
        }




























//    public static void main(String[] args) {
//        String str = "heLLo WOrLd";
//
//        String arr[] = str.split(" ");
//        String CheckCase ="";
//
//        for (int i=0; i<arr.length; i++){
//            //System.out.println(arr[i]);
//
//        }

















        // StringBuilder str1 = new StringBuilder("");
        //char temp[] = str.toCharArray();

//        String result = "";
//
//        for (int i = 0; i < str.length(); i++) {
//            String temp = "";
//            //  System.out.println(str);
//            if (checkUpperCase(str.charAt(i))){
//
//                temp = temp + str.toLowerCase();
//
//            }else{
//                temp = temp + str.toUpperCase();
//                //str1.append(result);
//            }
//            result = result + temp + " ";
//        }
//
//        System.out.println(result);
//
//    }
//    public static boolean checkUpperCase(char input){
//           return (input >= 'A' && input <= 'Z');
//    }
////    public static boolean checkLowerCase(char input){
////        return (input >= 'a' && input <= 'z');



//String Builder --> Append