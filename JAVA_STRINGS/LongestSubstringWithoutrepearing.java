package JAVA_STRINGS;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutrepearing {
    public static void main(String[] args) {
        
    }
    public static int length(String s){
               // Two pointers for the sliding window
        int st = 0;  // start of window
        int e = 0;   // end of window

        // Stores unique characters in the current window
        Set<Character> set = new HashSet<>();

        int max_l = 0; // length of longest substring found

        // Move the 'e' pointer until it reaches the end of the string
        while (e < s.length()) {

            // If the next character is NOT in the set, we can safely add it
            if (!set.contains(s.charAt(e))) {
                set.add(s.charAt(e));          // include character in current window
                e++;                           // move end pointer forward
                max_l = Math.max(max_l, set.size()); // update longest length
            }
            // If the character IS already in the set, remove the leftmost character
            else {
                set.remove(s.charAt(st)); // remove from set
                st++;                     // move start pointer forward (shrink window)
            }
        }

        return max_l;
    }
    }

