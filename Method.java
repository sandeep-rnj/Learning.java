class Method
{
    public static void Show(int...a)
    {
        for(int x : a)
        {
            System.out.println(x);
        }
    }
    public static void main(String args[])
    {
        Show();
        Show(10,20,30);
    }
}
