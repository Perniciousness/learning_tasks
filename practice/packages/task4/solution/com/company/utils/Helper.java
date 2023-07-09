package practice.packages.task4.solution.com.company.utils;

public final class Helper {
    private Helper(){}

    public static int generateRandomNumbers(int min, int max){
        return (int)(Math.random() * max - min + 1) + min;
    }
}
