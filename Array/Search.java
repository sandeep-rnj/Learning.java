package Array;
import java.util.Scanner;

class Search
{
    public static void main(String arg[])
    {
        Scanner Sc=new Scanner(System.in);
        int a[]={3, 9, 7, 8, 12, 6, 15, 5, 4, 10};
        int key;
        System.out.println("Enter The Value of Element : ");
        key=Sc.nextInt();

        for(int i=0; i < a.length ; i++)
        {
            if(a[i]==key)
            {
                System.out.println("Element found at: " + i);
                System.exit(0);
            }
        }
            System.out.println("Element Not Found");
    }
}
