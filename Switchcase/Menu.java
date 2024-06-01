package Switchcase;
import java.util.Scanner;

public class Menu {
    public static void main(String arg[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("MENU");
        System.out.println("===");
        System.out.println("ADD");
        System.out.println("SUB");
        System.out.println("MUL");
        System.out.println("DIV");

        System.out.println("Enter 2 Number");
        int x=Sc.nextInt();
        int y= Sc.nextInt();
        Sc.nextLine();
        System.out.println("Enter option in word");
        String option=Sc.nextLine();
        option=option.toUpperCase();
        switch(option)
        {
            case "ADD" : System.out.println("Sum is" +(x+y));
            break;
            case "SUB" : System.out.println("Substraction Is" +(x-y));
            break;
            case "MUL" : System.out.println("Product is" +(x*y));
            break;
            case "DIV" : System.out.println("Ratio is"+(x/y));
            break;
            default : System.out.println("Invalid");
        }
    }
}