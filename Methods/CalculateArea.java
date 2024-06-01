package Methods;

public class CalculateArea {
    static double area(double radius)
    {
        return Math.PI*radius*radius;
    }
    static double area(double length, double breadth)
    {
        return length*breadth;
    }
        public static void main(String args[])
        {
            int l=10, b=15;
            System.out.println("Area of a rectangle is : " +l*b);
            double  pi = 3.14159;
            double radius = 15.337;
            System.out.println("The Radius of a circle is : "+ radius);
        }
}
