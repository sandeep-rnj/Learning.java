package Loops;
import java.util.Scanner;

public class multi {
    public static void main(String arg[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int n=Sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(n+"X"+i+"="+i*n);
        }
    }
}
