package filter;

import java.util.Arrays;
import java.util.List;

public class Filter2 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Angelica", "Sofía", "Carlos Alberto", "Stella", "Martha Lucia", "Jose Maria");

        List<String> longNames = names.stream()
                .filter(n -> n.length()<=5)
                .toList();

        longNames.forEach(System.out::println);
    }
}
