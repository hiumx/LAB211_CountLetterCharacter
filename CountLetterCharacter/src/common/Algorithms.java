
package common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

/**
 *
 * @author Admin
 */
public class Algorithms {
    public Map<String, Integer> countLetters(String stringInput) {
        Map<String, Integer> result = new HashMap<>();

        String[] words = stringInput.split(" ");

        for (String word : words) {
            word = word.replaceAll("[^a-zA-Z0-9]", "");

            word = word.toLowerCase();
            if (result.containsKey(word)) {
                result.put(word, result.get(word) + 1);
            } else {
                result.put(word, 1);
            }
        }
        return result;
    }
    
    public Map<Character, Integer> countCharacters(String inputString) {
        Map<Character, Integer> result = new HashMap<>();
        inputString = inputString.trim();
        for (int i = 0; i < inputString.length(); i++) {
            char character = inputString.charAt(i);
            if(character != ' ') {
                if(result.containsKey(character)) {
                    result.put(character, result.get(character) + 1);
                } else {
                    result.put(character, 1);
                }
            }
        }
        return result;
    }
}
