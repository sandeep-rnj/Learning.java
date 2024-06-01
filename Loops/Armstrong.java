package Loops;
import java.util.Scanner;

public class Armstrong {
        public static void main(String arg[])
        {
            Scanner Sc=new Scanner(System.in);
            System.out.println("Enter a Number");
            int n=Sc.nextInt();
            int m=n;
            int sum=0;
            int r;

            while(n>0)
            {
                r=n%10;
                n=n/10;
                sum=sum+r*r*r;
            }
            if(sum==m)
                System.out.println("It is a ArmStrong Number");
            else
                System.out.println("It is not a Armstrong Number");
        }    
}
