package JAVA_STRINGS;

public class FindIndexOfFirstOcc {
    public static void main(String[] args) {
        String a = "yash is best";
        String b = "best";

        int index = findIndex(a, b);

        if (index != -1) {
            System.out.println("First occurrence of '" + b + "' is at index: " + index);
        } else {
            System.out.println("'" + b + "' not found in the string.");
        }
    }

    public static int findIndex(String a, String b) {
        for (int i = 0; i <= a.length() - b.length(); i++) {
            if (a.charAt(i) == b.charAt(0)) {
                if (a.substring(i, b.length() + i).equals(b)) {
                    return i;
                }
            }
        }
        return -1; // moved outside loop
    }
}
