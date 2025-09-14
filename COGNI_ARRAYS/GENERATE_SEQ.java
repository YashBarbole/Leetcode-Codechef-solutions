package COGNI_ARRAYS;

import java.util.Arrays;

public class GENERATE_SEQ {
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,6};
        int n=10;
        System.out.println(Arrays.toString(GenerateSeq(n, arr)));
    }

    public static int[] GenerateSeq(int n,int[]s){
        int []seq=new int[n];
        for(int i=0;i<Math.min(n, 6);i++){
            seq[i]=s[i];
        }

        for(int i=6;i<n;i++){
            seq[i]=seq[i-2]+seq[i-1];
        }
        return seq;
    }
}
