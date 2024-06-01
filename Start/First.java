package Start;

import java.util.Scanner;

public class First
{
    public static void main(String arg[])
    {
        String name;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("May I Know Your Name");
            name=sc.nextLine();
        }
        System.out.println("Welcome "+name);
    }
}