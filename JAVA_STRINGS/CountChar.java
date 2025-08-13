package JAVA_STRINGS;

public class CountChar {
    public static void main(String[] args) {
        String a=" i am yash";
        System.out.println("count is  "+ Count(a));
        
    }
    public static int Count(String s){
        int cnt=0;
        for(int i=0;i<=s.length()-1;i++){
                if(s.charAt(i)!=' '){
                    cnt++;
                }
        }
        return cnt;
    }
}
