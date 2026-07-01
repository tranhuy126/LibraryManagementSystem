package LibraryManagementSystem;
import java.util.List;
public class LibrarianManager {
    private List<Librarian> librarians;

    public LibrarianManager(List<Librarian> librarians){
        this.librarians = librarians;
    }
    public void addLibrarian(Librarian librarian){
        librarians.add(librarian);
    }
    public void showAllLibrarian(){
        if(librarians.isEmpty()){
            System.out.println("Chua co nhan vien.");
            return;
        }
        for(Librarian librarian : librarians){
            librarian.printInfo();
        }
    }
}
