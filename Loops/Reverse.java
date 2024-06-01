package Loops;
import java.util.Scanner;

class Reverse
{
    public static void main(String arg[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=Sc.nextInt();
        int rev=0;
        int r;
        while(n>0)
        {
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
            System.out.println(rev);
    }
} 
