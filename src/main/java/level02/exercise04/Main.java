package level02.exercise04;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    private static boolean isNumeric(String s) {
        return s.matches("\\d+");

    }

    public static void main(String[] args) {
        List<String> items = new ArrayList<>(List.of("banana", "12", "cherry", "7", "elephant", "apple", "bee", "42"));
        List<String> byFirstChar = new ArrayList<>(items);
        byFirstChar.sort(Comparator.comparingInt(s -> s.charAt(0)));
        System.out.println("1) By first character: " + byFirstChar);

        List<String> eFirst = new ArrayList<>(items);
        eFirst.sort((a, b) -> {
            boolean aHasE = a.contains("e");
            boolean bHasE = b.contains("e");
            if (aHasE == bHasE) return  a.compareTo(b);
            return aHasE ? -1 : 1;
        });

        System.out.println("2) 'e' first: " + eFirst);

        List<String> aToFour = items.stream()
                .map(s -> s.contains("a") ? s.replace('a', '4') : s)
                .toList();
        System.out.println("3) Replace 'a' -> '4' : " + aToFour);

        List<String> onlyNumbers = items.stream()
                .filter(Main::isNumeric)
                .toList();
        System.out.println("4) Only numeric: " + onlyNumbers);
    }
}
