package Array;

public class Maximum {
    public static void main(String arg[])
    {
        int a[]={3,5,87,68,98,4,32,10};
        int max=a[0];

        for(int i=0; i<a.length;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
            System.out.println("The Largest element is : " + max);
    }
}
