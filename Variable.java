public class Variable
{
    public static void main(String[] args)
    {
        Show();
        Show(10);
        Show(10, 20);
        Show(10, 20, 30);
    }

    public static void Show(int... x)
    {
        for (int a : x)
        {
            System.out.println(a);
        }
    }
}
