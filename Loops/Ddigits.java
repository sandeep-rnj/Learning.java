package Loops;
import java.util.Scanner;

public class Ddigits {
        public static void main(String arg[])
        {
            Scanner Sc=new Scanner(System.in);
            System.out.println("Enter the number");
            int n=Sc.nextInt();

            int r;
            while(n>0)
            {
                r=n%10;
                n=n/10;
                System.out.println(r);
            }
        }    
}
