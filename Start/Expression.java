package Start;

import java.util.Scanner;

class Expression
{
  public static void main(String args[])
  {
    Scanner Sc= new Scanner(System.in);
    int a,b,c;
    double r1,r2;
    System.out.println("Enter Values of a,b and c");
    a=Sc.nextInt();
    b=Sc.nextInt();
    c=Sc.nextInt();

    r1=(-b+Math.sqrt(-b*b-4*a*c))/(2*a);
    r2=(-b-Math.sqrt(-b*b-4*a*c))/(2*a);

    System.out.println("Roots are "+r1+" "+r2);
  }
}