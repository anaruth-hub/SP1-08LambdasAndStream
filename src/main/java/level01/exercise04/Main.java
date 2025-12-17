package level01.exercise04;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> months = List.of(
                "January", "Febreuary", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        );
        months.forEach(System.out::println);
    }
}
