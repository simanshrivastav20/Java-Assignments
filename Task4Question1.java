package Assignment4;

import java.util.Scanner;

public class Task4Question1 {
    public static void main(String[] args) {
       // JAVA program that takes given String of words and return the length of the shortest word.
//        String str;
        String string = "Hello Everyone, I hope you all are fine." + "";
        String word = "", small = "", large="";
        String[] words = new String[100];
        int length = 0;
        string = string + " ";
        int wordlength=0;

        for(int i = 0; i < string.length(); i++){
            if(string.charAt(i) != ' '){
                word = word + string.charAt(i);
            }
            else{
                words[length] = word;
                length++;

                word = "";
            }
        }
        small = words[0];

        //Determine smallest word in the string
        for(int k = 0; k < length; k++){

            if(small.length() > words[k].length())
                small = words[k];
            wordlength = small.length();
        }
        System.out.println("Smallest word: " + small);
        System.out.println("Length of smallest word: "+ wordlength);
    }
}
