

public class Check_Sorted {
    public static void main(String[] args) {
        int arr[]={3,4,5,7};
        System.out.println(CheckSorted(arr));
    }
    
    public static Boolean CheckSorted(int[]arr){
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }
}
