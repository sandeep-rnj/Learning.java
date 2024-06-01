package Conditionalstetment;
import java.util.Scanner;

public class Grades {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Mark of Student");
        int i=sc.nextInt();
        if(i>85)
        {
            System.out.println("Grade A");
        }
        else if(i>70 && i<85)
        {
            System.out.println("Grade B");
        }
        else if(i>55 && i<70)
        {
            System.out.println("Grade C");
        }
        else
        {
            System.out.println("Fail");
        }
    }
}
