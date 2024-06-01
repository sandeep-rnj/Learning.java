package Array;

public class ReverseCopying {
    
    public static void main(String[] args)
    {
        int[] originalArray = {1, 2, 3, 4, 5};
        int[] reversedCopiedArray = reverseCopyArray(originalArray);
        System.out.println("Reversed Copied Array: ");
        for (int i : reversedCopiedArray)
        {
            System.out.print(i + " ");
        }
    }
    public static int[] reverseCopyArray(int[] sourceArray)
    {
        int[] destinationArray = new int[sourceArray.length];
        for (int i = 0; i < sourceArray.length; i++)
        {
            destinationArray[i] = sourceArray[sourceArray.length - 1 - i];
        }
        
        return destinationArray;
    }
}
