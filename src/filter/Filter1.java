package filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter1 {
    public static void main(String[] args) {
        List<String> paises = Arrays.asList("Colombia", "Venezuela", "Argentina", "Bolivia","Brasil", "Chile","Ecuador", "Paraguay", "Uruguay", "Perú", "Guyana", "Surinam", "Guyana Francesa" );

// Filter the countries to only include those that start with the letter "A".
        List<String> filteredPaises = paises.stream()
                .filter(name -> name.startsWith("V"))
                .collect(Collectors.toList());

// Print the filtered names.
        System.out.println(filteredPaises);
    }
}
