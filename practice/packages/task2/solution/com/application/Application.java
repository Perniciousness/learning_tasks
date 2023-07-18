package practice.packages.task2.solution.com.application;

import java.util.logging.Logger;
import java.util.logging.Level;

import practice.packages.task2.solution.com.math.Calculator;

/*
 * Единственное требование к
 * методу `calculate` - это
 * возможность использовать методы
 * класса `Calculator`, и он с этим
 * успешно справляется.
 */

public final class Application {
    private Application(){}

    public static int calculate(Operation type, int firstNumber, int secondNumber){
        Logger logger = Logger.getLogger("output");
        switch (type) {
            case ADD:
                return Calculator.add(firstNumber, secondNumber);
            case SUBTRACT:
                return Calculator.subtract(firstNumber, secondNumber);
            case MULTIPLY:
                return Calculator.multiply(firstNumber, secondNumber);
            case DIVIDE:
                return Calculator.divide(firstNumber, secondNumber);
            default:
                logger.log(Level.WARNING, "Whatever operation this is, it is not supported in this version. Please, pick one of the four supported operations - add, subtract, multiply or divide.");
                return 0;
        }
    }
}
