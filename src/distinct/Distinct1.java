package distinct;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Distinct1 {
    public static void main(String[] args) {
        List<String> nombres = Arrays.asList("Ana", "Carlos", "Ana", "Luis", "Carlos", "Maria");

        // Usamos el stream() y distinct() para eliminar duplicados
        List<String> nombresUnicos = nombres.stream()
                .distinct()
                .collect(Collectors.toList());

        // Imprimimos la lista sin duplicados
        System.out.println("Nombres sin duplicados: " + nombresUnicos);
    }
}
