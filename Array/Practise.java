package Array;

class Practise
{
    public static void main(String arg[])
    {
        int A[][] = new int [5][5];
        int B[][] = {{1,2,3},{2,4,6},{1,3,5}};

        for (int i=0;i<B.length;i++)
        {
            for(int j=0; j<B[0].length; j++)
            {
                System.out.print(B[i] [j] + " ");
            }
                System.out.println(" ");
        }
    }
}
