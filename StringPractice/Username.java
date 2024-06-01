package StringPractice;


public class Username {
    public static void main(String args [])
    {
        String Str="Sandeep@gmail.com";
        int i=Str.indexOf("@");
        String Uname=Str.substring(0,i);
        String Domain=Str.substring(i+1,Str.length());
        System.out.println("Username :"+Uname);
        System.out.println("Domain :"+Domain);
    }
}
