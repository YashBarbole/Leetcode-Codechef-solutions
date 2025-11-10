package JAVA_ARRAYS;

import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers do you want to enter? ");
int n = sc.nextInt();

int[] arr = new int[n];
for (int i = 0; i < n; i++) {
    System.out.print("Enter number " + (i+1) + ": ");
    arr[i] = sc.nextInt();
}

System.out.println("Numbers entered: ");
for(int i : arr) {
    System.out.print(i + " ");
}

    }
}
