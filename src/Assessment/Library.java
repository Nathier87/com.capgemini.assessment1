package Assessment;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Author> authors=new ArrayList<>();
    public void add(Author author){
        System.out.println("Adding author" + author);
        authors.add(author);
    }
    private List<Book> books=new ArrayList<>();
    public void add(Book book){
        books.add(book);
    }



}
