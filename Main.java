package LibraryManagementSystem;
import java.util.Scanner;
enum Role{
    READER,
    LIBRARIAN;
}
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Library library = new Library("Thu vien HN");
        boolean running = true;
        while(running){
            System.out.println("\n=====Library Management System=====");
            System.out.println("1. Add Book");
            System.out.println("2. Add reader");
            System.out.println("3. View all book");
            System.out.println("4. View all reader");
            System.out.println("5. Borrow a book");
            System.out.println("6. Return a book");
            System.out.println("7. View library information");
            System.out.println("8. Exit");
            
            int choice;
            if(!sc.hasNextInt()){
                System.out.println("Vui long nhap 1 so");
                sc.next();
                continue;
            }
            choice = sc.nextInt();
            sc.nextLine();
            if(choice < 1 || choice > 8){
                System.out.println("Lua chon khong hop le");
                continue;
            }
            switch(choice){
                case 1 :
                    System.out.println("Nhap Id sach: ");
                    String idBook = sc.nextLine();
                    System.out.println("Nhap ten sach: ");
                    String bookName = sc.nextLine();
                    System.out.println("Nhap tac gia");
                    String bookAuthor = sc.nextLine();
                    Book book = new Book(idBook, bookName, bookAuthor);
                    library.getBookManager().addBook(book);
                    break;
                case 2 :
                    System.out.println("Nhap ma nguoi doc: ");
                    String readerID = sc.nextLine();
                    System.out.println("Nhap ten nguoi doc: ");
                    String readerName = sc.nextLine();
                    System.out.println("Nhap so dien thoai: ");
                    String phone = sc.nextLine();
                    System.out.println("Nhap email: ");
                    String email = sc.nextLine();
                    Reader reader = new Reader(readerID, readerName, phone, email);
                    library.getReaderManager().addReader(reader);
                    break;
                case 3 :
                    library.getBookManager().showAllBooks();
                    break;
                case 4 :
                    library.getReaderManager().showAllReaders();
                    break;
                case 5 :
                    System.out.println("Nhap readerId: ");
                    String readerId1 = sc.nextLine();
                    System.out.println("Nhap bookId: " );
                    String bookId1 = sc.nextLine();
                    library.borrowBook(readerId1, bookId1);
                    break;
                case 6 :
                    System.out.println("Nhap readerId: ");
                    String readerId2 = sc.nextLine();
                    System.out.println("Nhap bookId: " );
                    String bookId2 = sc.nextLine();
                    library.returnBook(readerId2, bookId2);
                    break;
                case 7 :
                    library.printInfo();
                    break;
                case 8 :
                    running = false;
                    break;
            }
            
        }
        sc.close();
    }
}
