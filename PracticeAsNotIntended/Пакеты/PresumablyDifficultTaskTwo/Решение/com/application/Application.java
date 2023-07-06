package com.application;

import com.math.Calculator;

/*
 * Единственное требование к
 * методу `calculate` - это
 * возможность использовать методы
 * класса `Calculator`, и он с этим
 * успешно справляется.
 */

public class Application {
    public static void calculate(){
        Calculator.add(42, 18);
        Calculator.subtract(42, 18);
        Calculator.multiply(42, 18);
        Calculator.divide(42, 18);
    }
}
