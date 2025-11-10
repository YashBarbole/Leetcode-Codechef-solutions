public class LONGEST_CONSEC_Seq {
    public static void main(String[] args) {
        
    }

    public static int LONGEST_SEQ(int arr[]){
        int cntcurr=0;
        int lastsmallest=Integer.MIN_VALUE;
        int longest=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]-1==lastsmallest){
                cntcurr+=1;
                lastsmallest=arr[i];
            }
            else if(arr[i]!=lastsmallest){
                cntcurr=1;
                lastsmallest=arr[i];
            }
            longest=Math.max(cntcurr,longest);
        }
        return longest;
    }

    
}
