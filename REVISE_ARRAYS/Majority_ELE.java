import java.util.HashMap;

public class Majority_ELE {
    public static void main(String[] args) {
        
    }

    public static int Majority(int arr[]){//hashmap its better soln
        HashMap<Integer,Integer>mpp= new HashMap<>();
        for(int num:arr){
                mpp.put(num, mpp.getOrDefault(num,0)+1);
        }

        int n= arr.length/2;
        for(int key:mpp.keySet()){
            if(mpp.get(key)>n){
                    return key;
            }
        }
        return -1;
    }

 public static int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;

        // Phase 1: Find candidate
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        // Phase 2: Verify candidate (not strictly needed if majority always exists)
        count = 0;
        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }

        if (count > nums.length / 2) {
            return candidate;
        }

        return -1; // in case no majority element
    }
}
