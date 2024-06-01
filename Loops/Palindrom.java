package Loops;
import java.util.Scanner;

class Palindrom
{
    public static void main(String arg[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=Sc.nextInt();
        int rev=0;
        int m=n;
        int r;
        while(n>0)
        {
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        if(rev==m)
            System.out.println("Numbe is Palindrom");
        else
            System.out.println("Number is Not a Palindrom");
    }
}