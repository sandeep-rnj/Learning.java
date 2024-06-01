package Loops;
import java.util.Scanner;

class Fibonacci
{
    public static void main(String arg[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Program to Fibonacco series");
        System.out.println("Enter Number of Terms");
        int n=Sc.nextInt();

        int a=0,b=1,c;
        System.out.print(a+" , "+b+" , ");
        for(int i=0;i<n-2;i++)
        {
            c=a+b;
            System.out.print(c+" , ");
            a=b;
            b=c;
        }
    }
}