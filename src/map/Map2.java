package map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map2 {
    public static void main(String[] args) {
        List<Taxista> people = Arrays.asList(new Taxista(1,"David", 5000.0, "RadioTaxi"), new Taxista(2, "Daniel", 5500.0, "RadioTaxi"));
        List<String> names = people.stream()
                .map(Taxista -> Taxista.getName().toUpperCase())
                .collect(Collectors.toList());
        System.out.println("Los siguientes taxistas estan disponibles");
        System.out.println(names);
    }
}
