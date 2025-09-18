import java.util.HashMap;

public class SubarrayWithSumKMOSTIMP {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5};
        int sum = 7;
        System.out.println(SubarraySum(arr, sum));
    }

    static int SubarraySum(int a[], int sum) {
        int csum = 0;
        int maxlen = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < a.length; i++) {
            csum += a[i];

            // Case 1: whole prefix itself is target
            if (csum == sum) {
                maxlen = Math.max(maxlen, i + 1);
            }

            // Case 2: check if we saw (csum - sum) before
            if (map.containsKey(csum - sum)) {
                int len = i - map.get(csum - sum);
                maxlen = Math.max(maxlen, len);
            }

            // Store earliest index of csum
            map.putIfAbsent(csum, i);
        }

        return maxlen;
    }
}
