import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class LibraryJson {

    private static String name;
    private static String author;
    private static String categorize;
    static Scanner scanner = new Scanner(System.in);

    private static final File path = new File("src/main/resources/library/catalog.json");

    public static void main(String[] args) {

        boolean cont = false;
        do {
            readingCatalog().forEach(System.out::println);

            System.out.println();
            System.out.println("Select operation: " +
                    "add book (1); " +
                    "delete book (2); " +
                    "exit the program (3).");
            scanner.useDelimiter("\n");

            int tittle = scanner.nextInt();
            switch (tittle) {
                case 1 -> {
                    System.out.println("Enter the name of the book, author and category");
                    name = scanner.next();
                    author = scanner.next();
                    categorize = scanner.next();
                    saveBookToCatalog();
                    cont = true;
                }
                case 2 -> {
                    System.out.println("Enter the name of the book");
                    name = scanner.next();
                    deleteBookFromCatalog();
                    cont = true;
                }
                case 3 -> {
                    scanner.close();
                    cont = false;
                }
            }
        } while (cont);
    }

    public static List<Books> readingCatalog() {
        ObjectMapper jsonMapper = new ObjectMapper();
        CollectionType javaType = jsonMapper.getTypeFactory().constructCollectionType(List.class, Books.class);
        List<Books> newLibrary = null;
        try {
            newLibrary = jsonMapper.readValue(path, javaType);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return newLibrary;
    }

    public static void saveBookToCatalog() {
        Books book = new Books(name, author, categorize);
        List<Books> library = readingCatalog();
        library.add(book);
        ObjectMapper jsonMapper = new ObjectMapper();
        try {
            jsonMapper.writeValue(path, library);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void deleteBookFromCatalog() {
        Books book = new Books(name);
        List<Books> library = readingCatalog();
        library.remove(book);
        ObjectMapper jsonMapper = new ObjectMapper();
        try {
            jsonMapper.writeValue(path, library);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

