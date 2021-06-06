package Assignment6;
class tri{
    String ss;
    String name ;
    public tri(String ss)
    {
        name = ss;
    }
    public tri(){
        name = "I love programming languages ";
    }

    public static void main(String[] args) {
        tri obj = new tri();
        obj.ss = "Java";
        System.out.println("I love " + obj.ss);
        System.out.println(obj.name);
    }
}