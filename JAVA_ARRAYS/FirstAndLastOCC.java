package JAVA_ARRAYS;

import java.util.ArrayList;

public class FirstAndLastOCC {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4, 5};
        int k = 2;

        ArrayList<Integer> ans = firstandlast(arr, k);
        System.out.println(ans); // Output: [1, 3]
    }

    public static ArrayList<Integer> firstandlast(int[] arr, int k) {
        int n = arr.length;
        int lb = Lowerb(arr, k); // first index where arr[i] >= k

        // If element not found
        if (lb == n || arr[lb] != k) {
            ArrayList<Integer> notFound = new ArrayList<>();
            notFound.add(-1);
            notFound.add(-1);
            return notFound;
        }

        int ub = Upperb(arr, k); // first index where arr[i] > k

        ArrayList<Integer> res = new ArrayList<>();
        res.add(lb);      // first occurrence
        res.add(ub - 1);  // last occurrence (just before ub)
        return res;
    }

    // Lower Bound → first index where value >= x
    public static int Lowerb(int[] arr, int x) {
        int n = arr.length;
        int low = 0, high = n - 1;
        int ans = n;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] >= x) {
                ans = mid;      // possible answer
                high = mid - 1; // search in left half
            } else {
                low = mid + 1;  // search in right half
            }
        }
        return ans;
    }

    // Upper Bound → first index where value > x
    public static int Upperb(int[] arr, int x) {
        int n = arr.length;
        int low = 0, high = n - 1;
        int ans = n;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] > x) {
                ans = mid;      // possible answer
                high = mid - 1; // search in left half
            } else {
                low = mid + 1;  // search in right half
            }
        }
        return ans;
    }
}
