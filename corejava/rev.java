package corejava;

import java.util.Arrays;
public class rev {
    public static void main(String[] args) {
          int [] arr={1,3,4,5};
        System.out.println(Arrays.toString(arr));
        rev(arr);
        System.out.println(Arrays.toString(arr));
    }


     static void rev(int []arr){
        int s=0;
        int e=arr.length-1;
       while(s<e){
        swap(arr, s, e);
        s++;
        e--;
       }
    }


     static void swap(int [] arr,int index1,int index2){
        int temp= arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;

    }
        
    
}
