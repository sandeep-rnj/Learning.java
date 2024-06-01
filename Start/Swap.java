package Start;

class Swap
{
    public static void main(String args[])
    {
        int a=10, b=15;
        a= a^b;
        b= a^b;
        a= a^b;

        System.out.println(a+" "+b);
    }
}