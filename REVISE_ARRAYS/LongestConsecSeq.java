import java.util.Arrays;

import JAVA_ARRAYS.removeDupli;

public class LongestConsecSeq {
    public static void main(String[] args) {
        
    }

    public static int longestSeq(int arr[]){
        Arrays.sort(arr);
        int longest=1;
        int cuntcurr=0;
       int lastSmallest=Integer.MIN_VALUE ;

       for (int i = 0; i < arr.length; i++) {
        if(arr[i]-1==lastSmallest){
            cuntcurr+=1;
            lastSmallest=arr[i];
        }
        else if(arr[i]!=lastSmallest){
            cuntcurr=1;
            lastSmallest=arr[i];
        }   
        longest=Math.max(longest,cuntcurr);
       }
       return longest;
    }
}
