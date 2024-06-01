class MaxNumber
{
    public static int max(int... a)
    {
        if (a.length == 0)
        {
            return Integer.MIN_VALUE;
        }
        int max = a[0];
        for (int i = 1; i < a.length; i++)
        {
            if (a[i] > max)
            {
                max = a[i];
            }
        }
        return max;
    }

    public static void main(String[] args)
    {
        System.out.println(max());
        System.out.println(max(10));
        System.out.println(max(10, 20));
        System.out.println(max(10, 20, 30));
    }
}
