package practice.oop.task6.services.impl;

import java.util.ArrayList;
import java.util.List;

import practice.oop.task6.models.Book;
import practice.oop.task6.models.BookGenre;
import practice.oop.task6.services.BookService;

public class BookServiceImpl implements BookService {

    private List<Book> bookDirectory;

    public BookServiceImpl(List<Book> bookDirectory){
        this.bookDirectory = bookDirectory;
    }

    @Override
    public void addBook(Book book){
        bookDirectory.add(book);
    }

    @Override
    public void deleteBook(Book book){
        bookDirectory.remove(book);
    }

    @Override
    public Book findBookByName(String name){
        
        for (Book book : bookDirectory){
            if (book.getBookName().equalsIgnoreCase(name)) {
                int i = bookDirectory.indexOf(book);
                return bookDirectory.get(i);
            }
        }
        return null;
    }

    @Override
    public List<Book> findBookByAuthor(String author) {
        
        List<Book> result = new ArrayList<>();
        for (Book book : bookDirectory){
            if (book.getAuthorName().equalsIgnoreCase(author)) {
                int i = bookDirectory.indexOf(book);
                result.add(bookDirectory.get(i));
            }
        }
        return result;
    }

    @Override
    public List<Book> findBookByGenre(BookGenre genre) {
        
        List<Book> result = new ArrayList<>();
        for (Book book : bookDirectory){
            if (book.getGenre().equals(genre)) {
                int i = bookDirectory.indexOf(book);
                result.add(bookDirectory.get(i));
            }
        }
        return result;
    }
}
