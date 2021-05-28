package Assignment4;

public class Task4Question3 {//a JAVA method to remove all the spaces from the String and return the resultant

    public static void main(String[] args) {
        String str= "M y N a m e I s S i m a n";
        String noSpace = str.replaceAll("\\s", "");
        System.out.println(noSpace);



    }
}
