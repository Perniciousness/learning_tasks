package practice.oop.task6.models;

public class Book {

    private String bookName;
    private String authorName;
    private BookGenre genre;

    public Book(String bookName, String authorName, BookGenre genre){

        this.bookName = bookName;
        this.authorName = authorName;
        this.genre = genre;
    }    
    
    public String getBookName(){ return bookName; }
    
    public String getAuthorName(){ return authorName; }
    
    public BookGenre getGenre(){ return genre; }
}
