package library;

import library.dao.LibraryDAO;
import library.dao.LibraryDAOim;
import library.model.Book;

import java.sql.SQLException;
import java.util.Scanner;

public class App {

    private static int bookId;

    public static void main(String[] args) throws SQLException {

        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        boolean continua = false;
        LibraryDAO libraryDAO = new LibraryDAOim();

        do {
            System.out.println("(1) read library");
            System.out.println("(2) get book from library");
            System.out.println("(3) save book in library");
            System.out.println("(4) remove book from library");
            System.out.println("(5) update book in library");
            System.out.println("(6) exit");

            int tittle = scanner.nextInt();
            switch (tittle) {
                case 1 -> {
                    libraryDAO.reedlib();
                    continua = true;
                }
                case 2 -> {
                    System.out.println("Enter the bookId of the book");
                    bookId = scanner.nextInt();
                    System.out.println(libraryDAO.getBook(bookId));
                    continua = true;
                }
                case 3 -> {
                    System.out.println("Enter the book: name, author, categorize and year");
                    String name = scanner.next();
                    String author = scanner.next();
                    String categorize = scanner.next();
                    int year = scanner.nextInt();
                    Book book = new Book(1,name,author,categorize,year);
                    libraryDAO.saveBook(book);
                    continua = true;
                }
                case 4 -> {
                    System.out.println("Enter the bookId and  of the book");
                    bookId = scanner.nextInt();
                    libraryDAO.removeBook(bookId);
                    continua = true;
                }
                case 5 -> {
                    System.out.println("Enter the bookId of the book being changed, and:" +
                            " name, author, categorize and year new book");
                    bookId = scanner.nextInt();
                    String name = scanner.next();
                    String author = scanner.next();
                    String categorize = scanner.next();
                    int year = scanner.nextInt();
                    Book book = new Book(1,name,author,categorize,year);
                    libraryDAO.updateBook(book,bookId);
                    continua = true;
                }
                case 6 -> {
                    scanner.close();
                    continua = false;
                }
            }
        }while (continua);
    }
}
