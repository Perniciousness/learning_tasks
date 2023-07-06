package com.company;

import java.util.Arrays;
import com.company.utils.Helper;

public class Utils {
    int[] bunchOfRandomNumbers = new int[10];
    public void util() {
        for (int i = 0; i < 10; i++) {
            bunchOfRandomNumbers[i] = Helper.generateRandomNumbers(1, 1000);
        }
    }

    public void outputResultFromUtil() {
        System.out.println(Arrays.toString(bunchOfRandomNumbers));
    }
}
