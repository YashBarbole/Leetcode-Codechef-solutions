import java.util.Arrays;

public class NEXT_PERMUTATION {
   
    public static int[] nextGreaterPermutation(int[] A) {
        int n = A.length;
        int ind = -1;

        // Step 1: Find the first index from right where A[i] < A[i+1]
        for (int i = n - 2; i >= 0; i--) {
            if (A[i] < A[i + 1]) {
                ind = i;
                break;
            }
        }

        // Step 2: If no such index → array is in descending order
        if (ind == -1) {
            reverse(A, 0, n - 1);
            return A;
        }

        // Step 3: Find the next larger element on the right side of ind
        for (int i = n - 1; i > ind; i--) {
            if (A[i] > A[ind]) {
                swap(A, i, ind);
                break;
            }
        }

        // Step 4: Reverse the part after ind to get the smallest arrangement
        reverse(A, ind + 1, n - 1);
        return A;
    }

    // Swap helper
    private static void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    // Reverse helper
    private static void reverse(int[] A, int start, int end) {
        while (start < end) {
            swap(A, start++, end--);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 4, 2};
        arr = nextGreaterPermutation(arr);
        System.out.println(Arrays.toString(arr)); // [1, 4, 2, 3, 5]
    }
}

    

