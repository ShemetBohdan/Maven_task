package library.dao;

import library.model.Book;

import java.sql.SQLException;

public interface LibraryDAO {

    Book getBook(int bookId) throws SQLException;

    void saveBook(Book book);

    void updateBook(Book book, int bookId);

    void removeBook(int bookId);

    void reedlib();

}
