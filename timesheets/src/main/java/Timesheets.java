import control.DatabaseConnector;
import control.EmployerSelectedListener;
import model.Database;
import model.Employer;
import view.EmployersTab;
import view.MainWindow;

import javax.swing.*;
import java.awt.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Timesheets {
    private static MainWindow program;
    private static Database db;
    private static DatabaseConnector dbc;

    public static void main(String[] args) {
        try {
            String username = JOptionPane.showInputDialog("Enter database username:");
            String password = JOptionPane.showInputDialog("Enter database password:");
            db = new Database(username, password, "localhost", 3306);
            dbc = new DatabaseConnector(db);
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }

        JPanel mainPanel = new JPanel();
        mainPanel.setSize(1280, 720);

        JTabbedPane tabs = new JTabbedPane();
        tabs.setSize(1280, 720);

        EmployersTab employersTab = new EmployersTab();
        try {
            employersTab.addEmployers(dbc.readEmployers());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }

        tabs.addTab("Employers", employersTab);

        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(tabs);
        program = new MainWindow("Timesheets", mainPanel);
    }
}
