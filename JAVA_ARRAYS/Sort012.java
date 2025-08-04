package JAVA_ARRAYS;

import java.util.Arrays;

public class Sort012 {
    public static void main(String[] args) {
        int arr[]={0,2,1,2,2,0,1};
        Sort012(arr);
        System.out.println(Arrays.toString(arr));
    
    }
    public static void Sort012(int[]a){
        int n=a.length;
        int l=0,m=0,h=n-1;
        while(m<=h){
            if(a[m]==0){
                Swap(a, m, l);
                l++;
                m++;  
            }
            else if(a[m]==1){
                m++;
            }
            else{
                Swap(a, m, h);
                h--;
            }
        }
    }
    public static void Swap(int []arr,int a,int b){
        int temp= arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    
}
