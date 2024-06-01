package Methods;

public class maxelement {
    public static void main(String[] args) {
        int A [] = {10, 20, 80, 40, 50};
        int max = findMax(A);
        System.out.println("Maximum element is: " + max);
    }

    public static int findMax(int[] A) {
        int max = A[0];
        for (int i = 1; i < A.length; i++) {
            if (A[i] > max) {
                max = A[i];
            }
        }
        return max;
    }
}
