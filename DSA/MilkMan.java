package DSA;

import java.util.Scanner;

class MilkMan {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the radius and height of the bottle (in cm):");

        int radius = scanner.nextInt();
        int height = scanner.nextInt();

        final double PI = 3.14;
        final double COST_PER_LITER = 40.0;
        double volumeCm3 = PI * radius * radius * height;
        double volumeLiters = volumeCm3 / 1000;
        double cost = volumeLiters * COST_PER_LITER;
        System.out.printf("The amount you need to pay is: %.2f%n", cost);
        scanner.close();
    }
}
