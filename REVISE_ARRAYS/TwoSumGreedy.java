import java.util.Arrays;

public class TwoSumGreedy {
    public static void main(String[] args) {
        int []arr={3,4,5,6};
        int ans[]=TwoSummm(arr, 11);
        System.out.println(ans[0]+","+ans[1]);
    }

    static int[] TwoSummm(int[]arr,int target){
        int l=0;
        int r=arr.length-1;
        Arrays.sort(arr);
        while(l<r){
            if((arr[l]+arr[r])==target){
                return new int []{arr[l],arr[r]};
            }
            else if((arr[l]+arr[r])<target){
                l++;
            }
            else{r--;
            }
        }
        return new int[]{-1,-1};
        
    }
}
