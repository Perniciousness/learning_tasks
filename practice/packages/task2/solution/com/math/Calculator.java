package practice.packages.task2.solution.com.math;

public final class Calculator {
    private Calculator(){}

    public static int add(int x, int y){
        return x + y;
    }

    public static int subtract(int x, int y){
        return x - y;
    }

    public static int multiply(int x, int y){
        return x * y;
    }

    public static int divide(int x, int y){
        try {
            return x / y;
        }
        catch (ArithmeticException ex) {
            ex.getMessage();
            return -1;
        }
    }
}
