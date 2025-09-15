package COGNI_ARRAYS;

import java.util.Scanner;

public class AdjacentGreater {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int N = sc.nextInt();
int[] A = new int[N];
for (int i = 0; i < N; i++) A[i] = sc.nextInt();
for (int i = 0; i < N; i++) {
int count = 0;
if (A[(i - 1 + N) % N] > A[i]) count++;
if (A[(i + 1) % N] > A[i]) count++;
System.out.print(count);
if (i < N - 1) System.out.print(" ");
}
}

    }

