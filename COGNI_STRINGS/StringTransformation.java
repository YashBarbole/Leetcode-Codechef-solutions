package COGNI_STRINGS;

public class StringTransformation {
    public static int minCost(String s1, String s2) {
        int[] freq1 = new int[26]; // counts for S1
        int[] freq2 = new int[26]; // counts for S2

        // count frequency of letters in S1
        for (char c : s1.toCharArray()) {
            freq1[c - 'a']++;
        }

        // count frequency of letters in S2
        for (char c : s2.toCharArray()) {
            freq2[c - 'a']++;
        }

        int cost = 0;

        // check how many extra letters needed
        for (int i = 0; i < 26; i++) {
            if (freq2[i] > freq1[i]) {
                cost += (freq2[i] - freq1[i]); // need to add missing letters
            }
        }

        return cost;
    }

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abccba";
        System.out.println("Minimum cost = " + minCost(s1, s2));
    }
}