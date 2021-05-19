package Assignment;

public class Swap {
    public static void main(String[] args) {
        //Using third variable
        int a = 10;
        int b = 5;
        int c;
        System.out.println("At First:");
        System.out.println("a="+a);
        System.out.println("b="+b);
        c=a+b;
        a=c-a;
        b=c-b;
        System.out.println("After Swap:"+"a="+ a + "b="+ b );


    //Without using another integer
        int x = 10;
        int y = 5;
        System.out.println("At First:");
        System.out.println("x="+x);
        System.out.println("y="+y);
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("After Swap:"+"x="+x+"y="+y);

    }
}
