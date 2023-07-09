package practice.packages.task1.solution.com.library;

import java.util.logging.Level;
import java.util.logging.Logger;

/** Класс-утилита со следующим содержимым:  
 * Заготовленный массив с несколькими книгами и методом
 * printBooks, позволяющим вывести все книги из библиотеки
 * в консоль. Возвращает массив имеющихся в `Library` книг.
 */

public final class Library {
    private Library(){}

    private static String[] books = new String[] {
        "Hunter’s Moon",
        "Johan’s Field Guild to Elk",
        "The Jongleur’s Bells",
        "The King’s Guide to Hunting Boar",
        "Knitting Your Way to Marriage",
        "Know Your Carnivorous Plants",
        "Lady DeWinter’s Betrayal",
        "A Lovers’ Quarrel",
        "Lunar Cycles",
        "Magic Yourself Thin",
        "Maps of Legend",
        "Merchant’s Guide to the Ovarin Pass",
        "Message in a Bottle",
        "Midwifery",
        "Minerals: Ore Grades",
        "Minerals: Precious and Semi-Precious Stones",
        "Ministers of the Red",
        "My Time with Mermaids",
        "Of Fools and Kings"};

    public static String[] printBooks() {
        Logger logger = Logger.getLogger("output");
        for (String book : books){
            logger.log(Level.INFO, "The library has the following book in its possession: {0}.", book);
        }
        return books;
    }
}
