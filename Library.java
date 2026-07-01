package LibraryManagementSystem;
import java.util.ArrayList;
import java.util.List;
public class Library {
    private String name;
    private List<Book> books;
    private List<Reader> readers;
    private List<Librarian> librarians;

    private BookManager bookManager;
    private ReaderManager readerManager;
    private LibrarianManager librarianManager;
    public Library(String name){
        this.name = name;
        books = new ArrayList<>();
        readers = new ArrayList<>();
        librarians = new ArrayList<>();
        bookManager = new BookManager(books);
        readerManager = new ReaderManager(readers);
        librarianManager = new LibrarianManager(librarians);
    }
  
    public String getName(){
        return name;
    }
    public List<Book> getBooks(){
        return books;
    }
    public BookManager getBookManager(){
        return bookManager;
    }
    public ReaderManager getReaderManager(){
        return readerManager;
    }
    public LibrarianManager getLibrarianManager(){
        return librarianManager;
    }
    
    public void borrowBook(String readerId, String bookId){
        Reader reader = readerManager.searchReaderById(readerId);
        Book book = bookManager.searchBookById(bookId);
        if(reader == null) {
            System.out.println("Ko tim duoc nguoi doc.");
            return;
        }
        if(book == null) {
            System.out.println("Sach ko trong thu vien.");
            return;
        }
        try {
            reader.borrowBook(book);
            System.out.println("Muon sach thanh cong.");
        }
        catch(Exception e) {
            System.out.println("Loi: " + e.getMessage());
        }
    }
    public void returnBook(String readerId, String bookId){
        Reader reader = readerManager.searchReaderById(readerId);
        Book book = bookManager.searchBookById(bookId);
        if(reader == null) {
            System.out.println("Ko tim duoc nguoi doc.");
            return;
        }
        if(book == null) {
            System.out.println("Sach ko trong thu vien.");
            return;
        }
        try{
            reader.returnBook(book);
            System.out.println("Tra sach thanh cong.");
        }
        catch(Exception e){
            System.out.println("Loi: " + e.getMessage());
        }
    }
    public void printInfo(){
        System.out.println("Ten thu vien: " + name);
        librarianManager.showAllLibrarian();
    }
}
