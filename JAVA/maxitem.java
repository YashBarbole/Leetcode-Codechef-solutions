package JAVA;

public class maxitem {
    public static void main(String[] args) {
        int [] arr={1,2,3,4};
        System.out.println(max(arr));

    }
    static int max(int  arr[]){
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
            
        }
        return max;
    }
    
}
