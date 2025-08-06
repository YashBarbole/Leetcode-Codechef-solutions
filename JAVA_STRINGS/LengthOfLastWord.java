package JAVA_STRINGS;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "yash is best";
        System.out.println("length of last word is " + Length(s));
    }

    public static int Length(String s) {
        String str = s.trim(); // remove leading/trailing spaces
        int cnt = 0;
        
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) != ' ') {
                cnt++;
            } else {
                break;
            }
        }
        
        return cnt;
    }
}
