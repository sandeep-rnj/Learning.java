package Start;

import java.util.Scanner;

class Cuboid
{
    public static void main(String args[])
    {
    Scanner Sc=new Scanner(System.in);
        int length,breadth,height;
        int totalArea,Volume;
        System.out.println("Enter Length Breadth and height ");
        length=Sc.nextInt();
        breadth=Sc.nextInt();
        height=Sc.nextInt();

        totalArea=2*(length*breadth+length*height+breadth*height);
        Volume=length*breadth*height;

        System.out.println("Total Area "+totalArea);
        System.out.println("volume "+Volume);
    }    
}