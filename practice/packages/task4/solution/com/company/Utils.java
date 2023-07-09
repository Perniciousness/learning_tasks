package practice.packages.task4.solution.com.company;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Arrays;

import practice.packages.task4.solution.com.company.utils.Helper;

public class Utils {
    private int[] bunchOfRandomNumbers = new int[10];
    public void util() {
        for (int i = 0; i < 10; i++) {
            bunchOfRandomNumbers[i] = Helper.generateRandomNumbers(1, 1000);
        }
    }

    public void outputResultFromUtil() {
        Logger logger = Logger.getLogger("output");
        logger.log(Level.INFO, () -> Arrays.toString(bunchOfRandomNumbers));
    }
}
