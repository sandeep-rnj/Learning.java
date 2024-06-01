package Loops;
import java.util.Scanner ;

public class Cdigits {
    public static void main(String arg[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=Sc.nextInt();
        int count=0;
        
        while(n>0)
        {
            n=n/10;
            count++;
        }
        {
            System.out.println(count);
        }
    }
}
