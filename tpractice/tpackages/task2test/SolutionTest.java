package tpractice.tpackages.task2test;

// Test related libraries
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

// What we're gonna test
import practice.packages.task2.solution.com.application.Application;
import practice.packages.task2.solution.com.math.Calculator;

class SolutionTest {
    // Random values to postpone pesticide effect
    int min = 1;
    int max = 100;
    int randomX = (int) (Math.random() * (max * 10 - min + 1) + min);
    int randomY = (int) (Math.random() * (max - min + 1) + min);

    // Unit tests for each of the methods
    // Can't use random values here due to the second value being constant
    @Test
    void applicationAddition(){
        assertEquals(Application.calculate(Application.Operation.ADD, 3, 7), 10);
    }

    @Test
    void calculatorAddition(){
        assertEquals(Calculator.add(3, 7), 10);
    }

    @Test
    void applicationSubtraction(){
        assertEquals(Application.calculate(Application.Operation.SUBTRACT, 3, 7), -4);
    }

    @Test
    void calculatorSubtraction(){
        assertEquals(Calculator.subtract(3, 7), -4);
    }

    @Test
    void applicationMultiplying(){
        assertEquals(Application.calculate(Application.Operation.MULTIPLY, 3, 7), 21);
    }

    @Test
    void calculatorMultiplying(){
        assertEquals(Calculator.multiply(3, 7), 21);
    }

    @Test
    void applicationDivision(){
        assertEquals(Application.calculate(Application.Operation.DIVIDE, 7, 3), 2);
    }

    @Test
    void calculatorDivision(){
        assertEquals(Calculator.divide(7, 3), 2);
    }

    @Test
    void applicationDivisionByZero(){
        assertEquals(Application.calculate(Application.Operation.DIVIDE, 7, 0), -1);
    }

    @Test
    void calculatorDivisionByZero(){
        assertEquals(Calculator.divide(7, 0), -1);
    }

    // Integrated tests with prepared random values
    @Test
    void addition(){
        assertEquals(Application.calculate(Application.Operation.ADD, randomX, randomY), Calculator.add(randomX, randomY));
    }

    @Test
    void subtraction(){
        assertEquals(Application.calculate(Application.Operation.SUBTRACT, randomX, randomY), Calculator.subtract(randomX, randomY));
    }

    @Test
    void multiplying(){
        assertEquals(Application.calculate(Application.Operation.MULTIPLY, randomX, randomY), Calculator.multiply(randomX, randomY));
    }

    @Test
    void division(){
        assertEquals(Application.calculate(Application.Operation.DIVIDE, randomX, randomY), Calculator.divide(randomX, randomY));
    }

    @Test
    void divisionByZero(){
        assertEquals(Application.calculate(Application.Operation.DIVIDE, randomX, 0), Calculator.divide(randomX, 0));
    }
}
