
import java.io.*;
import java.util.HashSet;
import java.util.Scanner;

public class Library {

    private static String name;
    private static String author;
    private static String categorize;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean bool = false;
        do {
            try {
                reedingCatalog().stream().forEach(System.out::println);
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
            System.out.println();
            System.out.println("Select operation: " +
                    "add book to directory (1); " +
                    "delete book in directory (2); " +
                    "exit the program (3).");
            scanner.useDelimiter("\n");
            int tittle = scanner.nextInt();
            if (tittle == 1) {
                System.out.println("Enter the name of the book, author and category");
                name = scanner.next();
                author = scanner.next();
                categorize = scanner.next();
                saveBookToCatalog();
                bool = true;
            }
            if (tittle == 2) {
                System.out.println("Enter the name of the book");
                name = scanner.next();
                deleteBookFromCatalog();
                bool = true;
            }
            if (tittle == 3) {
                scanner.close();
                bool = false;
            }
        }while (bool);
    }

    public static void deleteBookFromCatalog(){

        Books book = new Books(name);
        HashSet<Object> library = null;
        try {
            library = reedingCatalog();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        assert library != null;
        library.remove(book);
        try {
            File file = new File("src/main/resources/library/books catalog");
            FileOutputStream fileOut = new FileOutputStream(file);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            for (Object s : library) out.writeObject(s);
            out.close();
            fileOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void saveBookToCatalog() {

        Books book = new Books(name, author, categorize);

        HashSet<Object> library = null;
        try {
            library = reedingCatalog();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        assert library != null;
        library.add(book);
        try {
            File file = new File("src/main/resources/library/books catalog");
            FileOutputStream fileOut = new FileOutputStream(file);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            for (Object s : library) out.writeObject(s);out.close();

            fileOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static HashSet<Object> reedingCatalog() throws IOException, ClassNotFoundException {
        try {
            File file = new File("src/main/resources/library/books catalog");
            FileInputStream fileInput = new FileInputStream(file);
            ObjectInputStream input = new ObjectInputStream(fileInput);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            HashSet<Object> newLibrary = new HashSet<>();
            try {
                do {
                    if (file.canRead()){
                        newLibrary.add(input.readObject());
                    }else System.out.println("File is empty!");
                }while (bufferedReader.ready());
            }catch (EOFException ignored){
            }
            bufferedReader.close();
            fileReader.close();
            input.close();
            fileInput.close();
            return newLibrary;
        }catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

}
