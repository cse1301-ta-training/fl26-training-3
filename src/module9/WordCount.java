package module9;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordCount {
    public static Map<String, Integer> countWords(List<String> words) {
        Map<String, Integer> counts = new HashMap<String, Integer>();

        for (int i = 0; i < words.size(); i++) {
            String word = words.get(i);

            // TODO: If the word is already in counts, add 1 to its count.
            // Otherwise, put the word in counts with a count of 1.
            // reference to map syntax if needed!
        }

        return counts;
    }
}
