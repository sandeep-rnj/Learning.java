package Methods;

public class OverloadReverse
{
    int reverse(int n)
    {
    int rev=0;
    while(n!=0)
    {
        rev=rev*10+n%10;
        n=n/10;
    }
    return rev;
    }
    int[] reverse(int a[])
    {
        int[] b = new int[a.length];
        for (int i = a.length - 1, j = 0; i >= 0; i--, j++)
        {
            b[j] = a[i];
        }
        return b;
    }
        public static void main(String args[])
        {
            OverloadReverse or = new OverloadReverse();
            int number = 12345;
            int[] array = {1, 2, 3, 4, 5};
            System.out.println("Reversed integer: " + or.reverse(number));
            int[] reversedArray = or.reverse(array);
            System.out.print("Reversed array: ");
            for (int i : reversedArray)
            {
                System.out.print(i + " ");
            }
        }
}
