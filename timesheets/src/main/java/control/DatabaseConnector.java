package control;

import model.Database;

import javax.swing.*;
import java.sql.*;

public class DatabaseConnector {
    private Database db;
    private boolean dbConnected;

    public DatabaseConnector(Database db) {
        this.db = db;
        dbConnected = false;
    }

    public ResultSet executeQuery(String query) throws SQLException {
        try(Connection con = DriverManager.getConnection("jdbc:mariadb://" + db.getDomain() + "/", db.getUsername(), db.getPassword())) {
            try(Statement s = con.createStatement()) {
                try(ResultSet rs = s.executeQuery(query)) {
                    return rs;
                }
            }
        }
    }

    public String getDatabaseUsername() {
        return db.getUsername();
    }

    public void setDatabaseUsername(String username) {
        db.setUsername(username);
    }

    // Get database password? Think about how to securely access this information

    public void setDatabasePassword(String password) {
        db.setPassword(password);
    }

    public String getDatabaseDomain() {
        return db.getDomain();
    }

    public void setDatabaseDomain(String domain) {
        db.setDomain(domain);
    }

    public int getDatabasePort() {
        return db.getPort();
    }

    public void setDatabasePort(int port) {
        db.setPort(port);
    }

    public boolean isConnected() {
        return dbConnected;
    }
}
