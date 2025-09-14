package COGNI_ARRAYS;

import java.util.ArrayList;

public class Subarray_Sum_triplets {
public static int countTriplets(int[] arr, int N) {
int count = 0;
for (int i = 0; i <= N - 3; i++) {
if (arr[i] + arr[i + 2] == arr[i + 1]) {
count++;
}
}
return count;
}
public static void main(String[] args) {
int[] arr = {1, 2, 1, 3, 5, 2, 4, 2};
int N = 8;
System.out.println(countTriplets(arr, N));
}

}
