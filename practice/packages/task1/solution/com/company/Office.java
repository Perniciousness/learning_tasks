package practice.packages.task1.solution.com.company;

/**
 * Данный класс имеет лишь один метод
 * useLibrary(), возвращающий то же,
 * что и метод printBooks() класса Library.
 */

import practice.packages.task1.solution.com.library.Library;

public final class Office {
    private Office(){}

    public static String[] useLibrary() {
        return Library.printBooks();
    }

public static void unrelatedRandomMethod() { /* Unrelated to task */}
}