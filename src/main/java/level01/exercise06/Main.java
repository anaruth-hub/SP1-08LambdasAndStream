package level01.exercise06;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> mixed = new ArrayList<>(List.of("7",  "honey", "cat", "12345", "sun", "stramverry"));

        mixed.sort(Comparator.comparingInt(String::length));
        System.out.println(mixed);
    }
}
