package arraysfinal;

import java.lang.reflect.Array;
import java.util.Arrays;

import corejava.swap;

public class sort012 {
    public static void main(String[] args) {
        int arr[]={1,1,1,2,0,0,2,2,0};
        sort012(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort012(int arr[]){
        int l=0,h=arr.length-1,m=0;
        while(m<=h){
            if(arr[m]==0){
            Swap(arr, l, m);
            l++;
            m++;
        }
        else if(arr[m]==1){
            m++;
        }
        else{
            Swap(arr, m, h);
            h--;
        }
        }
    }

    public static void Swap(int arr[],int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp; 
    }
}
