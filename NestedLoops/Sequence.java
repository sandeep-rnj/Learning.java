package NestedLoops;

class Sequence {
    public static void main(String args[])
    {
        int count=0;

        for(int i=1; i<=5;i++)
        {
            for(int j=1; j<=5;j++)
            {
                count++;
                System.out.format(count +" ");
            }
                System.out.println("");
        }
    }
}
