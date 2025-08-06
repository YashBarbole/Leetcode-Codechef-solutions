package JAVA_STRINGS;

public class ReverseWords {
    public static void main(String[] args) {
        System.out.println(Reverse("i am yash"));
        
    }
    public static String Reverse (String s){
            String[] words=s.split(" ");
            StringBuilder sb=new StringBuilder();
            for(int i=words.length-1;i>=0;i--){
                    sb.append(words[i]);
                    sb.append(" ");
            }
            return sb.toString().trim();
    }
    
}
