public class MAX_CONSEC_ONES {
    public static void main(String[] args) {
        int arr[]={1,2,1,1,0,2,0,0};
        System.out.println(MaxConsecOnes(arr));
    }

    static int MaxConsecOnes(int arr[]){
        int MaxLen=0;
        int len=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==1){
                len++;
                MaxLen=Math.max(MaxLen, len);
            }
            else{
                len=0;
            }
        }
        return MaxLen;
    }
}
