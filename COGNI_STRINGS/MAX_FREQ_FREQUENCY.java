package COGNI_STRINGS;

import java.util.HashMap;
import java.util.Map;

public class MAX_FREQ_FREQUENCY {
    public static int findMaxFreqFrequency(int N, String S) {
Map<Character, Integer> freq = new HashMap<>();
for (char c : S.toCharArray()) {
freq.put(c, freq.getOrDefault(c, 0) + 1);
}
Map<Integer, Integer> freqOfFreq = new HashMap<>();
for (int f : freq.values()) {
freqOfFreq.put(f, freqOfFreq.getOrDefault(f, 0) + 1);
}
int maxCount = -1, resultFreq = Integer.MAX_VALUE;
for (Map.Entry<Integer, Integer> e : freqOfFreq.entrySet()) {
int frequency = e.getKey();
int count = e.getValue();
if (count > maxCount || (count == maxCount && frequency < resultFreq)) {
maxCount = count;
resultFreq = frequency;
}
}
return resultFreq;
}
public static void main(String[] args) {
int N = 20;
String S = "ACABDDABDCDACFAEGFDA";
System.out.println(findMaxFreqFrequency(N, S)); // Output: 1
}

}
