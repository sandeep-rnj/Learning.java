class ListName
{
    static void ShowList(String...s)
    {
        for(int i=0; i<s.length; i++)
        {
            System.out.println(i+1+"." +s[i]);
        }
    }
        public static void main(String args[])
        {
            ShowList("Sandeep","John","Ajay","suhana","Sandhaya");
        }
}
