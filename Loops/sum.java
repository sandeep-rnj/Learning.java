package Loops;
import java.util.Scanner;

public class sum {
    public static void main(String arg[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int n=Sc.nextInt();

        int sum=0;
        for(int i=1;i<=10;i++)
        {
            sum=sum+i;
        }
        System.out.println("Sum of "+n+" Number is "+sum);
    }
}
