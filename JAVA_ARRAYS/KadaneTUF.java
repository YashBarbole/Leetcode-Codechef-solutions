package JAVA_ARRAYS;

public class KadaneTUF {
    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, 2, 4, -5, -6, -2, 3, 2};

        int maxSum = kadane(arr);
        System.out.println("Maximum sum is: " + maxSum);
    }

    public static int kadane(int[] a) {
        int maxi = Integer.MIN_VALUE; // Biggest sum found so far
        int sum = 0;                   // Current running sum
        int start = 0;                  // Current subarray start index
        int ansStart = -1, ansEnd = -1; // Best subarray's start and end indices

        for (int i = 0; i < a.length; i++) {

            // ✅ If sum is zero, mark potential start of subarray here
            if (sum == 0) {
                start = i;
            }

            // Add current element to sum
            sum += a[i];

            // If this is the best sum so far, update answer
            if (sum > maxi) {
                maxi = sum;
                ansStart = start;
                ansEnd = i;
            }

            // If sum becomes negative, reset it to zero
            if (sum < 0) {
                sum = 0;
            }
        }

        // Print the subarray with max sum
        System.out.print("Subarray is: ");
        for (int i = ansStart; i <= ansEnd; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        return maxi;
    }
}
