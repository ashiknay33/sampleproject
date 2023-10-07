// Main.java

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int resultAdd = calculator.add(5, 3);
        System.out.println("Addition: " + resultAdd);

        int resultSubtract = calculator.subtract(10, 4);
        System.out.println("Subtraction: " + resultSubtract);

        int resultMultiply = calculator.multiply(6, 7);
        System.out.println("Multiplication: " + resultMultiply);

        double resultDivide = calculator.divide(15, 3);
        System.out.println("Division: " + resultDivide);
    }
}
