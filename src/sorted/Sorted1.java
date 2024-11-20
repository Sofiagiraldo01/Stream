package sorted;

import javax.print.DocFlavor;
import java.util.Arrays;
import java.util.List;

public class Sorted1 {
    public static void main(String[] args) {
        List<String> letters = Arrays.asList("A", "C","D", "B", "Z");

// Sort the numbers in ascending order.
        List<String> sortedLetters = letters.stream()
                .sorted()
                .toList();

// Print the sorted numbers.
        System.out.println(sortedLetters);
    }
}
