package library.dao;

import library.config.DataBaseConfig;
import library.model.Book;

import java.sql.*;

public class LibraryDAOImpl implements LibraryDAO {

    private final Connection connection;

    public LibraryDAOImpl() {
        this.connection = new DataBaseConfig().getDBConnection();
    }

    @Override
    public Book getBook(int bookId) {

        var select = "SELECT * FROM library WHERE book_Id =?";
        PreparedStatement preparedStatement;
        ResultSet result;

        try {
            preparedStatement = connection.prepareStatement(select);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        try {
            preparedStatement.setInt(1, bookId);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        try {
            result = preparedStatement.executeQuery();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        try {
            result.next();
            return new Book(
                    result.getInt("book_Id"),
                    result.getString("name"),
                    result.getString("author"),
                    result.getString("categorize"),
                    result.getInt("year"));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void saveBook(Book book) {
        String select = "INSERT INTO library (name,author,categorize,year) VALUES (?,?,?,?);";
        PreparedStatement preparedStatement;
        try {
            preparedStatement = connection.prepareStatement(select);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        try {
            preparedStatement.setString(1, book.getName());
            preparedStatement.setString(2, book.getAuthor());
            preparedStatement.setString(3, book.getCategorize());
            preparedStatement.setInt(4, book.getYear());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void removeBook(int bookId) {

        String select = "DELETE FROM library WHERE book_id=?";
        PreparedStatement preparedStatement;

        try {
            preparedStatement = connection.prepareStatement(select);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        try {
            preparedStatement.setInt(1, bookId);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void updateBook(Book book, int book_id) {
        String select = "" +
                "UPDATE library " +
                "SET name=?, author=?, categorize=?, year= ? " +
                "WHERE book_id=?;";
        PreparedStatement preparedStatement;

        try {
            preparedStatement = connection.prepareStatement(select);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        try {
            preparedStatement.setString(1, book.getName());
            preparedStatement.setString(2, book.getAuthor());
            preparedStatement.setString(3, book.getCategorize());
            preparedStatement.setInt(4, book.getYear());
            preparedStatement.setInt(5, book_id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void reedlib() {

        String select = "SELECT * FROM library order by book_id";
        ResultSet result;
        Statement statement;
        try {
            statement = connection.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        try {
            result = statement.executeQuery(select);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        try {
            while (result.next()) {
                System.out.println(
                        result.getInt("book_id") + " "
                                + result.getString("name") + " "
                                + result.getString("author") + " "
                                + result.getString("categorize") + " "
                                + result.getInt("year"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
