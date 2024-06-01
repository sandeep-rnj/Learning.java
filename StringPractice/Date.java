package StringPractice;

public class Date {
    public static void main(String args[])
    {
        String Str="23/03/2000";
        System.out.println(Str.matches("([0-2][0-9]|3[0-1])/(0[1-9]|1[0-2])/\\d{4}"));
    }
}
