package Assignment4;

public class Task4Question4a {//a JAVA program that reverse the words of a sentence.
    public static void main(String[] args) {
        String str = "Be Happy and Stay Motivated";
        String arr[] = str.split(" ");
        String reversedString = "";
        for(int i = 0; i< arr.length; i++){
            String word = arr[i];
            String reversedWord = "";
            for(int j = word.length()-1; j>=0; j--){
                reversedWord = reversedWord + word.charAt(j);
            }
            reversedString = reversedString + reversedWord +" ";

        }
        System.out.println(reversedString);
    }
}
