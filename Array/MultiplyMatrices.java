package Array;

public class MultiplyMatrices  {
    public static void main(String arg[])
    {
        int A[][]= {{3,5,9},{7,6,2},{4,3,5}};
        int B[][]= {{1,5,2},{6,8,4},{3,9,7}};
        int c[][]= new int[3][3];

        for(int i=0; i<A.length; i++)
        {
            for (int j=0; j<A[0].length; j++)
            {
                c[i][j]=A[i][j]* B[i][j];
            }
        }
        System.out.println("Resulting Matrix : ");
        for(int i = 0; i < c.length; i++)
        {
            for (int j = 0; j < c[i].length; j++)
            {
                System.out.print(c[i][j] + " ");
            }
                System.out.println();
        }
    }
}
