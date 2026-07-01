package LibraryManagementSystem;
public class Librarian  extends User{
    public Librarian(String userId, String name, String phone, String email){
        super(userId, name, phone, email);
    }
    @Override
    public void printInfo(){
        System.out.println("Librarian Id: " + getUserId() + " | Name: " + getName() + " | Phone: " + getPhone() + " | Email: " + getEmail());
    }
}