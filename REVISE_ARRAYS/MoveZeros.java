import java.util.Arrays;

import corejava.swap;

public class MoveZeros {
    public static void main(String[] args) {
        int arr[]={3,4,0,0,0,6,7};
        MoveZeross(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void MoveZeross(int arr[]){
            int n=arr.length;
            int j=0;
            for (int i = 0; i < n; i++) {
                if(arr[i]!=0){
                    Swap(arr, j, i);
                    j++;
                }
            }
    }

    static void Swap(int arr[],int a,int b){
            int temp=arr[a];
            arr[a]=arr[b];
            arr[b]=temp;
    }
}
