package Switchcase;
import java.util.Scanner;

public class Month {
    public static void main(String arg[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter Month Number");
        int month=Sc.nextInt();
        switch(month)
        {
            case 1: System.out.println("January");
            break;
            case 2: System.out.println("Febrary");
            break;
            case 3: System.out.println("March");
            break;
            case 4: System.out.println("April");
            break;
            case 5: System.out.println("May");
            break;
            case 6: System.out.println("June");
            break;
            case 7: System.out.println("July");
            break;
            case 8: System.out.println("August");
            break;
            case 9: System.out.println("Septembur");
            break;
            case 10: System.out.println("Octuber");
            break;
            case 11: System.out.println("Novembur");
            break;
            case 12: System.out.println("Decembur");
            break;
            default : System.out.println("Invalid");
        }
    }
}
