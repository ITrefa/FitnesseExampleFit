package exampleFixture;

public class Calculator {
    public Calculator() {
    }
    public int add(int value1, int value2) {
        return value1 + value2;
    }

    public int subtract(int value1, int value2) {
        return value1 - value2;
    }

    public int multiply(int value1, int value2) {
        return value1 * value2;
    }

    public int divide(int value1, int value2) {
        if (value2 == 0) {
            throw new ArithmeticException("/ by zero");
        } else
            return value1 / value2;
    }
}
