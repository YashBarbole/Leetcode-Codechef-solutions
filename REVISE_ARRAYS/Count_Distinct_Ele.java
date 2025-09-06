import java.util.HashSet;
import java.util.Set;

public class Count_Distinct_Ele {
    public static void main(String[] args) {
        int []arr={2,5,6,6,8,9,9};
        System.out.println(CountDistinct(arr));
    }
    public static int CountDistinct(int a[]){
        Set<Integer> set= new HashSet<>();
        for(int element:a){
            set.add(element);
        }
        return set.size();
    }
}
