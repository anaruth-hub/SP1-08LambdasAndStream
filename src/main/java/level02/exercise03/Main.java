package level02.exercise03;

public class Main {
    public static void main(String[] args) {
        FloatOperation add = (a, b) -> a + b;
        FloatOperation subtract = (a, b) -> a - b;
        FloatOperation multiplication = (a, b) -> a * b;
        FloatOperation division = (a, b) -> a / b;

        float x = 12f;
        float y = 2f;

        System.out.println("Add: " + add.operation(x, y));
        System.out.println("Subtract: " + subtract.operation(x, y));
        System.out.println("Multiply: " + multiplication.operation(x, y));
        System.out.println("Division: " + division.operation(x, y));

    }
}
