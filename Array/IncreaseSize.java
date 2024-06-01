package Array;

public class IncreaseSize
{
        public static void main(String[] args)
    {
        int[] originalArray = {1, 2, 3, 4, 5};
        int[] largerArray = increaseArraySize(originalArray, 10);
        System.out.println("Larger Array: ");
        for (int i : largerArray)
        {
            System.out.print(i + " ");
        }
    }
    public static int[] increaseArraySize(int[] sourceArray, int newSize) 
    {
        if (newSize <= sourceArray.length)
        {
            throw new IllegalArgumentException("New size must be greater than the original size.");
        }
        int[] largerArray = new int[newSize];
        for (int i = 0; i < sourceArray.length; i++)
        {
            largerArray[i] = sourceArray[i];
        }
        return largerArray;
    }
}
