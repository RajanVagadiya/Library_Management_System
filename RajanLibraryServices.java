import java.util.ArrayList;

class Book {
    public String name, author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}

class MyLibrary {
    public ArrayList<Book> books;

    public MyLibrary(ArrayList<Book> books) {
        this.books = books;
    }

    public void addBook(Book book) {
        System.out.println("The book has been added to the library");
        this.books.add(book);
    }

    public void issueBook(Book book, String issued_to) {
        System.out.println("The book has been issued from the library to " + issued_to);
        this.books.remove(book);
    }

    public void returnBook(Book b) {
        System.out.println("The book has been returned");
        this.books.add(b);
    }

}

public class RajanLibraryServices {
    public static void main(String[] args) {
        ArrayList<Book> bk = new ArrayList<>();

        MyLibrary parag = new MyLibrary(bk);
        Book b1 = new Book("Database Management Systems", "Chandni P.Gajera");
        parag.addBook(b1);
        Book b2 = new Book("Data Structure And Algorithms", "Amit K. Chikhliya");
        parag.addBook(b2);
        Book b3 = new Book("Web Development", "Bhuvan J. Kagthara");
        parag.addBook(b3);
        Book b4 = new Book("Cyber Security", "Jenil R. Suthar");
        parag.addBook(b4);
        Book b5 = new Book("Mobile Application Development", "Nilesh D.Bhimani");
        parag.addBook(b5);
        System.out.println(parag.books);
        parag.issueBook(b3, "Rajan V. Vagadiya");
        System.out.println(parag.books);

    }
}