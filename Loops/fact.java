package Loops;
import java.util.Scanner;

public class fact {
    public static void main(String arg[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int n=Sc.nextInt();
        long fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial is "+ fact);
    }
}
