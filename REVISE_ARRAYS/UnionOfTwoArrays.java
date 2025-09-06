import java.util.HashSet;
import java.util.Set;

public class UnionOfTwoArrays {
    public static void main(String[] args) {
        int arr[] ={4,2,3,1,7};
        int arr2[]={6,2,3,4};
        System.out.println(Union(arr,arr2));
    }

    public static int Union(int a[], int b[]){
        Set<Integer> set= new HashSet<>();
        for(int x:a){
            set.add(x);
        }
        for(int x:b){
            set.add(x);
        }
        return set.size();
    }
}
