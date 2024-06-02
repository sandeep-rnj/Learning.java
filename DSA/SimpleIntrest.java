package DSA;

import java.util.Scanner;

class SimpleInterest
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Principle Amount:");
        double principal = scanner.nextDouble();

        System.out.println("Enter Rate Of Interest:");
        double rate = scanner.nextDouble();

        System.out.println("Enter Time:");
        double time = scanner.nextDouble();

        double interest = (principal * rate * time) / 100;
        System.out.printf("Interest: %.6f", interest);

        scanner.close();
    }
}
