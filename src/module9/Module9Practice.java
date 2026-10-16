package module9;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Module9Practice {
    public static void main(String[] args) {
        List<String> words = new ArrayList<String>();
        words.add("to");
        words.add("be");
        words.add("to");

        Map<String, Integer> counts = WordCount.countWords(words);
        System.out.println("Word counts: " + counts);
        System.out.println("Expected counts: to=2 and be=1 (in any order)");

        Snake snake = new Snake();
        System.out.println("Before moving: " + snake);
        snake.move(1, 0);
        System.out.println("After moving:  " + snake);
        System.out.println("Expected: [(6, 5), (5, 5), (4, 5)]");
    }
}
