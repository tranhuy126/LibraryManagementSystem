package LibraryManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class BookManager {
    private List<Book> books;
    public BookManager(List<Book> books){
        this.books = books;
    }
    public void addBook(Book book){
        books.add(book);
    }
    public void removeBook(Book book){
        books.remove(book);
    }
    public List<Book> searchBookByTitle(String title){
        List<Book> result = new ArrayList<>();
        for(Book book : books){
            if(book.getTitle().equalsIgnoreCase(title)){
                result.add(book);
            }
        }
        return result;
    }
    public Book searchBookById(String id){
        for(Book book : books){
            if(book.getBookId().equals(id)){
                return book;
            }
        }
        return null;
    }
    public void showAllBooks(){
        if(books.isEmpty()){
            System.out.println("Thu vien chua co sach.");
            return;
        }
        for(Book book : books){
            book.display();
        }
    }
}