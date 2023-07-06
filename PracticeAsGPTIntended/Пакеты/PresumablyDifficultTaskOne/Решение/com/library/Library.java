package com.library;

/** Содержимое:  
 * Заготовленный массив с несколькими
 * книгами и методом printBooks, позволяющим вывести
 * все книги из библиотеке в консоль.
 */

 /*
 * Поскольку в задании указано, что метод printBooks
 * будет выводить список книг, то откуда этот список
 * брать, куда и как это будет делаться - конкретная
 * имплементация остального на усмотрение учащегося.
 */
public class Library {

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

    public static void printBooks(){
        for (String book : books){
            System.out.println(book);
        }
    }
}
