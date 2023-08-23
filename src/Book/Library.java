package Book;

import java.util.ArrayList;
import java.util.Scannner;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library(){
        books = new ArrayList<Book>();
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void displayBook(){
        for(Book book:books){
            System.out.println(book);
        }
    }
}
