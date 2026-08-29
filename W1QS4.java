
import java.util.*;

public class W1QS4 {

    public static char findFirstNonRepeatingChar(String text) {
        Map<Character, Integer> frequencyMap = new LinkedHashMap<>();
        
        for (char c : text.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        for (char c : text.toCharArray()) {
            if (frequencyMap.get(c) == 1) {
                return c;
            }
        }
        return '\0'; // Indicates no non-repeating character found
    }

    public static void main(String[] args) {
        String[] testCases = {"swiss", "aabbcc", "coding"};

        for (String text : testCases) {
            char result = findFirstNonRepeatingChar(text);
            if (result != '\0') {
                System.out.printf("Input: \"%s\" -> First Non-Repeating Character: '%c'%n", text, result);
            } else {
                System.out.printf("Input: \"%s\" -> No Non-Repeating Character Found%n", text);
            }
        }
    }
}
