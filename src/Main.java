import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //Tuscias konstruktorius//
        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();

        //Pilnas konstruktorius//
        Book book1 = new Book();
        book1.setTitle("Kaktusas ar pienė");
        book1.setPages(270);
        book1.setReleaseYear(2021);

        book2.setTitle("Tiems, kurie neskaito");
        book2.setPages(240);
        book2.setReleaseYear(2024);

        book3.setTitle("Nebaigti reikalai");
        book3.setPages(320);
        book3.setReleaseYear(2024);

        Book book4 = new Book("Kaktusas ar pienė", 270, 2021);
        Book book5 = new Book("Tiems, kurie neskaito", 240, 2024);
        Book book6 = new Book("Nebaigti reikalai", 320, 2024);

        ArrayList<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        books.add(book6);

        for (int i = 0; i < books.size(); i++) {
            System.out.println(book1.getTitle() + book1.getPages() + book1.getReleaseYear());
        }






























    }
}