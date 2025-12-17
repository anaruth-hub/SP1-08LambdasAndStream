package level01.exercise02;

import java.util.List;

public class Main {
    public static List<String>
    StringWithLetterOAndLongerThan5(List<String> input) {
        return input.stream()
                .filter(s -> s.contains("o"))
                .filter(s-> s.length() > 5)
                .toList();
    }

    public static void main(String[] args) {
        List<String> words = List.of("moon", "sun", "balloon", "cloud", "stormy", "rain");

        List<String> result =
                StringWithLetterOAndLongerThan5(words);
        System.out.println(result);
    }
}
