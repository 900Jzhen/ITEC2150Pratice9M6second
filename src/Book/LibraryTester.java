package Book;

public class LibraryTester {
    public static void main(String[] args){
        Library km = new Library();

        Book book1 = new Book("Chemistry II","Benjammin",1964);
        Book book2 = new Book("Body 0","Bill Bryson",2022);
        Book book3 = new Book("Mind of Matter","Eliza T",2003);

        km.addBook(book1);
        km.addBook(book2);
    }
}
