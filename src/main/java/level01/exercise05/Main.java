package level01.exercise05;

public class Main {
    public static void main(String[] args) {
        PiValueProvider piProvider = () -> 3.1415;
        System.out.println("Pi is: " + piProvider.getPiValue());
    }
}
