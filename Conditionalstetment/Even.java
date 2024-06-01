package Conditionalstetment;
import java.util.Scanner;
public class Even {
    public static void main(String arg[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int i=Sc.nextInt();
        if(i%2==0)
        {
            System.out.println("Even Number");
        }
        else
        {
            System.out.println("Odd Number");
        }
    }
}
