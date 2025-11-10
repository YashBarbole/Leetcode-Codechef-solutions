package stringsfinal;

public class index_of_first_occu {
    public static void main(String[] args) {
        
    }

    public static int index(String a,String b){
        for(int i=0;i<a.length()-b.length()+1;i++){
            if(a.charAt(i)==b.charAt(0)){
                if(a.substring(i, b.length()+i).equals(b)){
                  return i;  
                }
            }
        }
        return -1;
    }
}
