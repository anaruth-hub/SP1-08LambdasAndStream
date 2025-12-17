package level02.exercise01;

public class Main {
    public static void main(String[] args) {
        StringReverser reverser = text -> new StringBuilder(text).reverse().toString();

        String original = "CozyBunny";
        String reversed = reverser.reverse(original);

        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }
}
