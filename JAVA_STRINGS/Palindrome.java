package JAVA_STRINGS;

public class Palindrome {
    public static void main(String[] args) {
        String s= "yash";
        System.out.println(palindromee(s));
        
    }

    public static Boolean palindromee(String s){
          s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
          int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
      
    

}
