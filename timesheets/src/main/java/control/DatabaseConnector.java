package control;

import model.Database;
import model.Employer;
import model.Shift;

import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;

public class DatabaseConnector {
    private Database db;
    private boolean dbConnected;

    public DatabaseConnector(Database db) {
        this.db = db;
        dbConnected = false;
    }

    public ArrayList<Employer> readEmployers() throws SQLException {
        ArrayList<Employer> employers = new ArrayList<>();

        try(Connection con = DriverManager.getConnection("jdbc:mariadb://" + db.getDomain() + "/aarontraynor_timesheet", db.getUsername(), db.getPassword())) {
            try(Statement s = con.createStatement()) {
                try(ResultSet rs = s.executeQuery("SELECT * FROM EMPLOYERS")) {
                    while(rs.next()) {
                        int id = rs.getInt("ID");
                        String name = rs.getString("NAME");
                        double hourlyRate = rs.getDouble("SALARY");
                        employers.add(new Employer(id, name, hourlyRate));
                    }
                }
            }
        }

        return employers;
    }

//    public ArrayList<Shift> readShiftsFromEmployer(int employerID) throws SQLException {
//        // Change this method to read all shifts from all employers, then create a construct in memory
//    }

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
