package library.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConfig {

    private final String user = "postgres";
    private final String password = "2133282";
    private final String url = "jdbc:postgresql://localhost:5432/postgres";

    private final Connection connection;

    public DataBaseConfig() {
        this.connection = createConnection();
    }

    private Connection createConnection() {

        try {
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Connection getDBConnection() {
        return this.connection;
    }
}

