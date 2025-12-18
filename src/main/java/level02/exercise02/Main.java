package level02.exercise02;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static String toEvenOddCsv(List<Integer> numbers) {
        return numbers.stream()
                .map(n -> (n % 2 == 0 ? "e" : "o") + n)
                .collect(Collectors.joining(", "));

    }


    public static void main(String[] args) {
        List<Integer> nums = List.of(3, 55, 44);
        System.out.println(toEvenOddCsv(nums));

    }
}
