package Methods;

public class Return
{
    static int max(int x, int y)
    {
        return x > y ? x : y;
    }

    String getNameFromEmail(String email)
    {
        int a = email.indexOf('@');
        if (a == -1) 
        {
            return " ";
        }
        String name = email.substring(0, a);
        return name;
    }

    public static void main(String[] args) 
    {
        Return obj = new Return();
        String email="Sandeep@gmail.com";
        System.out.println();
        System.out.println("Original Email: "+email);
        
        System.out.println("\nName from email: " + obj.getNameFromEmail(email));
        System.out.println();
    }
}
