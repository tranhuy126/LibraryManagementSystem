package LibraryManagementSystem;
import java.util.List;
public class ReaderManager {
    private List<Reader> readers;

    public ReaderManager(List<Reader> readers){
        this.readers = readers;
    }
    public void addReader(Reader reader){
        readers.add(reader);
    }
    public void showAllReaders(){
        if(readers.isEmpty()){
            System.out.println("Chua co nguoi doc nao.");
            return;
        }
        for(Reader reader : readers){
            reader.printInfo();
        }
    }
    public Reader searchReaderById(String id){
        for(Reader reader : readers){
            if(reader.getUserId().equals(id)){
                return reader;
            }
        }
        return null;
    }
}
