package practice.oop.task6.services;

import java.util.List;

import practice.oop.task6.models.Book;
import practice.oop.task6.models.BookGenre;

public interface BookService {
    
    void addBook(Book book);
    
    void deleteBook(Book book);

    Book findBookByName(String name);

    List<Book> findBookByAuthor(String author);

    List<Book> findBookByGenre(BookGenre genre);
}
