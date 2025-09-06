package JAVA_STRINGS;

public class REVERSE_STR {
    public static void main(String[] args) {
        String abc="YASH";
        System.out.println(Reverse(abc));
    }
    static String Reverse(String s){
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev+=s.charAt(i);
        }
        return rev;
    }
}
