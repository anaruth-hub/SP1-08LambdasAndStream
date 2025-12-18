package level02.exercise01;

import java.util.List;

public class Main {
    public static java.util.List<String> cuteAThreeLetterNames(java.util.List<String> names) {
        return names.stream()
                .filter(n -> n.startsWith("A"))
                .filter(n -> n.length() == 3)
                .toList();
    }

    public static void main(String[] args) {
        List<String> names = List.of("Ana", "Ari", "Ale", "Alex", "Bob", "Abba", "Annie", "Ariel");
        System.out.println(cuteAThreeLetterNames(names));
    }
}
