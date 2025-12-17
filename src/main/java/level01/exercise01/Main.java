package level01.exercici01;

import java.util.List;

public class Main {
    public static List<String> StringsWithLetterO(List<String> input) {
        return input.stream()
                .filter(s -> s.contains("o"))
                .toList();
    }

    public static void main(String[] args) {
        List<String> words = List.of("moon", "sun", "cloud", "sky", "storm", "rain");

        List<String> result = StringsWithLetterO(words);
        System.out.println(result);
    }
}
