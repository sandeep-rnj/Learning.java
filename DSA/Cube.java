package DSA;

import java.util.Scanner;

class Cube {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the side length of the cube:");
        int sideLength = scanner.nextInt();

        int surfaceArea = 6 * (sideLength * sideLength);
        int volume = sideLength * sideLength * sideLength;

        System.out.println("Surface Area: " + surfaceArea);
        System.out.println("Volume: " + volume);

        scanner.close();
    }
}
