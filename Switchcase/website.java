package Switchcase;
import java.util.Scanner;

public class website {
    public static void main(String arg[])
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter Domain Name");
        String domain=Sc.nextLine();
        String ext=domain.substring(domain.lastIndexOf(".")+1);
        switch(ext)
        {
            case "com" : System.out.println("Commercial");
            break;
            case "org" : System.out.println("Organisation");
            break;
            case "gov" : System.out.println("Goverment");
            break;
            case "net" : System.out.println("Network");
            break;
            default : System.out.println("Invalid");
        }
    }
}