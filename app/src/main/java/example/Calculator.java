package example;

public class Calculator {
    public int add(int a, int b) {
        return a+b;
    }

    public int minus(int a, int b) {
        if (a > b) {
            return a-b;
        } else {
            return b-a;
        }
    }

    public int multiply(int a, int b) {
        return a*b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divided by 0");
        }
        return a/b;
    }
}
