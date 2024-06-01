package Array;

class RightRotation 
{
    public static void main(String arg[])
    {
        int a[]={3,9,7,8,12,6,15,5,4,10};
        for(int x:a)
        System.out.print(x + " , ");
        System.out.println(" ");

        int temp=a[a.length-1];
        for(int i=a.length-1;i>0;i--)
        {
            a[i] = a[i-1];
        }
            a[0]=temp;

            for(int x:a)
            System.out.print(x + " , ");
            System.out.println(" ");
    }
}
