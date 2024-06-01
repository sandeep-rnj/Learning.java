public class Sum
{
    public static int sum(int...numbers)
    {
        int sum=0;
        for(int num :numbers)
        {
            sum +=num;
        }
            return sum;
    }

    public static void main(String args[])
    {
        int result=sum(1,2,3,4,5);
        System.out.println("Sum: " + result);
    }
}
