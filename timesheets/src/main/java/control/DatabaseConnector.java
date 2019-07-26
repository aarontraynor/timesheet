package control;

import model.Database;
import model.Employer;
import model.Shift;

import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;

public class DatabaseConnector {
    private static Database db;
    private static boolean dbConnected;
    private static String dbcURL;

    public DatabaseConnector(Database db) {
        this.db = db;
        dbConnected = false;
        dbcURL = "jdbc:mariadb://" + db.getDomain() + "/aarontraynor_timesheet";
    }

    public static ArrayList<Employer> readEmployers() throws SQLException {
        ArrayList<Employer> employers = new ArrayList<>();

        try(Connection con = DriverManager.getConnection(dbcURL, db.getUsername(), db.getPassword())) {
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

    public static ArrayList<Shift> readShiftsFromEmployer(int employerID) throws SQLException {
        ArrayList<Shift> shifts = new ArrayList<>();

        try(Connection con = DriverManager.getConnection(dbcURL, db.getUsername(), db.getPassword())) {
            try(Statement s = con.createStatement()) {
                try(ResultSet rs = s.executeQuery("SELECT * FROM SHIFTS WHERE EMPLOYER_ID=" + employerID)) {
                    while(rs.next()) {
                        int id = rs.getInt("ID");
                        int employer = rs.getInt("EMPLOYER_ID");
                        Date startDate = rs.getDate("STARTDATE");
                        Date endDate = rs.getDate("ENDDATE");
                        Time startTime = rs.getTime("STARTTIME");
                        Time endTime = rs.getTime("ENDTIME");

                        Shift newShift = new Shift(employer, startDate, endDate, startTime, endTime);
                        newShift.setId(id);
                        shifts.add(newShift);
                    }
                }
            }
        }

        return shifts;
    }

    public static String getDatabaseUsername() {
        return db.getUsername();
    }

    public static void setDatabaseUsername(String username) {
        db.setUsername(username);
    }

    // Get database password? Think about how to securely access this information

    public static void setDatabasePassword(String password) {
        db.setPassword(password);
    }

    public static String getDatabaseDomain() {
        return db.getDomain();
    }

    public static void setDatabaseDomain(String domain) {
        db.setDomain(domain);
    }

    public static int getDatabasePort() {
        return db.getPort();
    }

    public static void setDatabasePort(int port) {
        db.setPort(port);
    }

    public static boolean isConnected() {
        return dbConnected;
    }
}
