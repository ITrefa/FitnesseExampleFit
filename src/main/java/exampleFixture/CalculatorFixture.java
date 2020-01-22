package exampleFixture;

import fit.ColumnFixture;

public class CalculatorFixture extends ColumnFixture {
    Calculator calculator = new Calculator();
    public int value1;
    public int value2;


    public int add() {
        return (calculator.add(value1, value2));
    }

    public int subtract() {
        return (calculator.subtract(value1, value2));
    }

    public int multiply() {
        return (calculator.multiply(value1, value2));
    }

    public int divide() {
        return (calculator.divide(value1, value2));
    }

}
