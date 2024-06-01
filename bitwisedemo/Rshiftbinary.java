package bitwisedemo;

public class Rshiftbinary {
    public static void main(String args[])
    {
        int x= 0b1010;
        int y;
        y = x>>1;
        System.out.println(String.format("%s",Integer.toBinaryString(x)));
        System.out.println(String.format("%s",Integer.toBinaryString(y)));
    }
}
