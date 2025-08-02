package JAVA_ARRAYS;

public class Largest {
    public static void main(String[] args) {
        int [] arr={2,5,8,2,3};
        System.out.println(Largest(arr));
        
    }

    public static int Largest(int[] nums){
        int largest=nums[0];
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>largest){
                largest=nums[i];
            }
            
        }
        return largest;

    }
    
}
