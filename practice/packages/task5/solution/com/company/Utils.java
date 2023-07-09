package practice.packages.task5.solution.com.company;

import java.util.logging.Level;
import java.util.logging.Logger;

import practice.packages.task5.solution.com.company.utils.MathUtils;

public final class Utils {
    private Utils(){}

    public static int utilizeMath(int firstNumber, int secondNumber){
        Logger logger = Logger.getLogger("output");
        int x = MathUtils.calculateSum(firstNumber, secondNumber);
        logger.log(Level.INFO, "Result: {0}", x);
        return x;
    }
}