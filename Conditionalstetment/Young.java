package Conditionalstetment;
import java.util.Scanner;

public class Young {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Age of the Person");
        int i=sc.nextInt();
        if(i<=30)
        {
            System.out.println("Person is Young");
        }
        else if(i>30 && i<60)
        {
            System.out.println("Person is in Mid age");
        }
        else
        {
            System.out.println("Person is Old");
        }
    }
}
