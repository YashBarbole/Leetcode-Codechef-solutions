package JAVA_ARRAYS;

import java.util.ArrayList;
import java.util.Arrays;

public class Leaders {
    public static void main(String[] args) {
        int arr[]={2,3,7,1,4,3,2};
        ArrayList<Integer> leaders = Leaders(arr);
        System.out.println(leaders);    
    }
    public static ArrayList<Integer> Leaders(int arr[]){
        int n=arr.length;
        ArrayList<Integer>leaders= new ArrayList<>(); 
        int maxi=Integer.MIN_VALUE;
        for (int i = n-1; i >=0; i--) {    
            if(arr[i]>maxi){
                leaders.add(arr[i]);
            }
            maxi=Math.max(maxi, arr[i]);
        }
        return leaders;
    }
}
