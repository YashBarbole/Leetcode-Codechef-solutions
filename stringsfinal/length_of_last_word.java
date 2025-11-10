package stringsfinal;

public class length_of_last_word {
    public static void main(String[] args) {
        String s="yash is best";
        System.out.println(length(s));

    }

    static int length(String s){
        String str=s.trim();
        int cnt=0;
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)!=' ')   cnt++;
            else break;
         
        }
        return cnt;
        
    }
}
