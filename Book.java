package LibraryManagementSystem;

public class Book {
    private String bookId;
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String bookId, String title, String author){
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setIsAvailable(boolean isAvailable){
        this.isAvailable = isAvailable;
    }
    public String getBookId(){
        return bookId;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public boolean isAvailable(){
        return isAvailable;
    }
    public void borrowBook(){
        if(isAvailable) isAvailable = false;
        else throw new IllegalStateException("Book da duoc muon.");
    }
    public void returnBook(){
        isAvailable  = true;
    }
    public void display(){
        String status = isAvailable ? "Chua muon" : "Da muon";
        System.out.println("Ma sach: " + bookId + "| Tieu de: " + title + "| Tac gia: " + author + "| Tinh trang: " + status);
    }
}
