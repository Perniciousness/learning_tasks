package com.company.utils;

public class Helper {
    public static int generateRandomNumbers(int min, int max){
        return (int)(Math.random() * max - min + 1) + min;
    }
}
