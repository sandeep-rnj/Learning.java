package Array;

class Copying {
    
    public static void main(String[] args)
    {
        int[] originalArray = {1, 2, 3, 4, 5};
        int[] copiedArray = copyArray(originalArray);
        System.out.println("Copied Array: ");
        for (int i : copiedArray)
        {
            System.out.print(i + " ");
        }
    }
    public static int[] copyArray(int[] sourceArray)
    {
        int[] destinationArray = new int[sourceArray.length];
        for (int i = 0; i < sourceArray.length; i++)
        {
            destinationArray[i] = sourceArray[i];
        }
        
        return destinationArray;
    }
}
