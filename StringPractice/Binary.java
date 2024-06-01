package StringPractice;

public class Binary {
    public static void main(String args[])
    {
        int b=1000110;
        String Str=String.valueOf(b);
        System.out.println(Str.matches("[01]+"));
    }
}
