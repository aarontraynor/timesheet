import model.Employer;
import view.EmployersTab;
import view.MainWindow;

import javax.swing.*;
import java.awt.*;

public class Timesheets {
    public static void main(String[] args) {
        Employer mapleblue = new Employer("MapleBlue Ltd.", 15.0);
        Employer svhealth = new Employer("SV Health Managers LLP", 15.0);

        JPanel mainPanel = new JPanel();
        mainPanel.setSize(1280, 720);

        JTabbedPane tabs = new JTabbedPane();
        tabs.setSize(1280, 720);

        EmployersTab employersTab = new EmployersTab();
        employersTab.addEmployer(mapleblue);
        employersTab.addEmployer(svhealth);

        JPanel panel2 = new JPanel();
        panel2.setSize(1280, 720);

        JPanel panel3 = new JPanel();
        panel3.setSize(1280, 720);

        tabs.addTab("Employers", employersTab);
        tabs.addTab("Tab2", panel2);
        tabs.addTab("Tab3", panel3);

        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(tabs);
        MainWindow program = new MainWindow("Timesheets", mainPanel);
    }
}
