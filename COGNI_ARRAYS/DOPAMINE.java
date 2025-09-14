package COGNI_ARRAYS;

import java.util.Scanner;

public class DOPAMINE {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N=sc.nextInt();
        int l=sc.nextInt();
        int r=sc.nextInt();
        int [] a= new int[N];
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }
        System.out.println(Dopamie(N, l, r, a));
    }

    public static int Dopamie(int N,int l,int r,int arr[]){
        int dopamine=0;
        int maxDopa=Integer.MIN_VALUE;
        int minDopa=Integer.MAX_VALUE;

        for (int i : arr) {
            if(i>=l&&i<=r)dopamine++;
            else dopamine--;
            maxDopa=Math.max(maxDopa,dopamine);
            minDopa=Math.min(minDopa,dopamine);
        }
        return maxDopa+minDopa;
    }
}
