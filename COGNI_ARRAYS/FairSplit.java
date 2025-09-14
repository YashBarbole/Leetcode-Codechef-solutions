package COGNI_ARRAYS;

public class FairSplit {
public static int countFairSplits(int N, int[] A) {
    int TotalSum=0;
    for (int i = 0; i <N; i++) {
        TotalSum+=A[i];
    } 
    int count=0;
    int prefixSum=0;
    for (int i = 0; i <N-1; i++) {
        prefixSum+=A[i];
        int suffixSum= TotalSum-prefixSum;
        if(Math.abs(prefixSum-suffixSum)%2==0){
            count++;
        }
    }

    return count;

    }

    public static void main(String[] args) {
        int arr[]={2,3,4,5,6};
        System.out.println(countFairSplits(5, arr));
    }

}
