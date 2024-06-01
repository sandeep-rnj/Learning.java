package Loops;
import java.util.Scanner;

class Gpseries
{
    public static void main(String arg[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Program to print GP Series");
        System.out.println("Enter a,r and n");

        int a=Sc.nextInt();
        int r=Sc.nextInt();
        int n=Sc.nextInt();
        int term=a;

        for(int i=0;i<n;i++)
        {
            System.out.print(term+",");
            term=term*r;
        }
    }
}
