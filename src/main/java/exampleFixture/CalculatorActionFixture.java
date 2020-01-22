package exampleFixture;

import fit.ActionFixture;

public class CalculatorActionFixture extends ActionFixture {
    Calculator calculator = new Calculator();
    public int value1;
    public int value2;

    public void setValue1(int value1) {
        this.value1 = value1;
    }

    public void setValue2(int value2) {
        this.value2 = value2;
    }

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
