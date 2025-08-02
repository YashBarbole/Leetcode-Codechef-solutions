package JAVA_ARRAYS;

import java.util.Arrays;

public class moveZeros {
    public static void main(String[] args) {
         int [] arr={2,5,0,8,2,0,3};
       int[]result=  move0(arr);
        System.out.println(Arrays.toString(result));
        
    }

    public static int [] move0(int [] a){
        int n=a.length;
        int j=-1;
        for (int i = 0; i <n; i++) {
            if(a[i]==0){
                j=i;
                break;
            }
          }

        if (j == -1) return a;


        for(int i=j+1;i<n;i++){
            if(a[i]!=0){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                j++;
                
            }
        }
        return a;
    } 
}
