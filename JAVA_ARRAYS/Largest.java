package JAVA_ARRAYS;

public class Largest {
    public static void main(String[] args) {
        int [] arr={2,5,8,2,3};
        System.out.println(largest(arr));
        
    }
    public static int largest(int[] nums){
        int largest=nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]>largest){
                largest=nums[i];
            }        
        }
        return largest;
    }
}