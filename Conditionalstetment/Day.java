package Conditionalstetment;
import java.util.Scanner;

public class Day
{
    public static void main(String arg[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter The Day");
        int i=Sc.nextInt();
        if(i==1)
        {
            System.out.println(" Monday");
        }
        else if(i==2)
        {
            System.out.println(" Tuesday");
        }
        else if(i==3)
        {
            System.out.println(" Wednesday");
        }
        else if(i==4)
        {
            System.out.println("Thursday");
        }
        else if(i==5)
        {
            System.out.println(" Friday");
        }
        else if(i==6)
        {
            System.out.println("Saturday");
        }
        else if(i==7)
        {
            System.out.println("Sunday");
        }
        else
        {
            System.out.println("Invalid");
        }
    }
}
