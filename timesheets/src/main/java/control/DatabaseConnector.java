package control;

import model.Database;

import java.sql.*;

public class DatabaseConnector {
    private Database db;
    private Connection con;
    private boolean dbConnected;

    public DatabaseConnector(Database db) {
        this.db = db;
        dbConnected = connect();
    }

    public boolean connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jbdc:mysql://" + db.getDomain() + ":" + db.getPort() + "/timesheet", db.getUsername(), db.getPassword());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return false;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public void disconnect() {
        try {
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
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
