package LibraryManagementSystem;
import java.util.ArrayList;
import java.util.List;
public class Reader extends User implements BorrowAble{
    private List<Book> borrowedBooks = new ArrayList<>();

    public Reader(String userId, String name, String phone, String email){
        super(userId, name, phone, email);
    }
    @Override
    public void borrowBook(Book book){
        if(!book.isAvailable()){
            throw new IllegalStateException("Sach da duoc muon");
        }
        borrowedBooks.add(book);
        book.borrowBook();
    }
    @Override
    public void returnBook(Book book){
        if(!borrowedBooks.contains(book)){
            throw new IllegalArgumentException("Ban khong muon sach nay");
        }
        borrowedBooks.remove(book);
        book.returnBook();
    }
    @Override
    public void printInfo(){
        System.out.println("Member ID: " + getUserId() + " | Name: " + getName() );
        System.out.println("Sach da muon: ");
        if(borrowedBooks.isEmpty()){
            System.out.println("None");
        }
        else{
            for(Book book : borrowedBooks) System.out.println(book.getTitle());
        }
    }
}