package cap04;

public class ArrayMax {

    public static void main(String[] args) {
        int[] A = {1, 3, 5, 7, 9, 2, 4, 6, 8, 0};
        int max = new ArrayMax().arrayMax(A);
        System.out.println("Max: " + max);
    }

    // O(n)
    public int arrayMax(int[] A) {
        int currMax = A[0]; // O(1)
        for (int i = 1; i < A.length; i++) { // O(n)
            if (A[i] > currMax) { // O(1)
                currMax = A[i]; // O(1)
            }
        }
        return currMax;
    }
}
