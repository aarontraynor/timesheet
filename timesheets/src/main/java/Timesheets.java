import control.DatabaseConnector;
import control.EmployerSelectedListener;
import model.Database;
import model.Employer;
import view.EmployersTab;
import view.MainWindow;

import javax.swing.*;
import java.awt.*;

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
            dbc.connect();
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }

        Employer mapleblue = new Employer("MapleBlue Ltd.", 15.0);
        Employer svhealth = new Employer("SV Health Managers LLP", 15.0);

        JPanel mainPanel = new JPanel();
        mainPanel.setSize(1280, 720);

        JTabbedPane tabs = new JTabbedPane();
        tabs.setSize(1280, 720);

        EmployersTab employersTab = new EmployersTab();
        employersTab.addEmployer(mapleblue);
        employersTab.addEmployer(svhealth);

        tabs.addTab("Employers", employersTab);

        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(tabs);
        program = new MainWindow("Timesheets", mainPanel);
    }

    public void readEmployers() {

    }
}
