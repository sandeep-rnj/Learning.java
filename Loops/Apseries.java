package Loops;
import java.util.Scanner;

class Apseries
{
    public static void main(String arg[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Program to print AP Series");
        System.out.println("Enter a,d and n");

        int a=Sc.nextInt();
        int d=Sc.nextInt();
        int n=Sc.nextInt();
        int term=a;

        for(int i=0;i<n;i++)
        {
            System.out.print(term+",");
            term=term+d;
        }
    }
}
