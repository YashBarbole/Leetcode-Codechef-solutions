package JAVA_ARRAYS;

public class maxproductsubarr {
    public static void main(String[] args) {
      int[] arr = {1, 2, -3, 4, -2, -1, 5};
        int result = subarrayWithMaxProduct(arr);
        System.out.println("Maximum product is: " + result);
    }    

public static int subarrayWithMaxProduct(int[] arr) {
        int n = arr.length;
        int pre = 1; // prefix product (left to right)
        int suff = 1; // suffix product (right to left)
        int ans = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (pre == 0) pre = 1;
            if (suff == 0) suff = 1;

            pre *= arr[i];         // multiply from left
            suff *= arr[n - i - 1]; // multiply from right

            ans = Math.max(ans, Math.max(pre, suff));
        }

        return ans;
    }
}
