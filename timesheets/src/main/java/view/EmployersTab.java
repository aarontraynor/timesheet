package view;

import control.EmployerSelectedListener;
import model.Employer;

import javax.swing.*;
import java.awt.*;

public class EmployersTab extends JPanel {
    private EmployersSidebar sidebar;
    private EmployerPanel currentEmployer;

    public EmployersTab() {
        super();
        init();
    }

    private void init() {
        sidebar = new EmployersSidebar();
        currentEmployer = new EmployerPanel();

        EmployerSelectedListener esl = new EmployerSelectedListener(currentEmployer, sidebar);
        sidebar.addEmployerSelectedListener(esl);

        this.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.gridwidth = 1;
        c.gridheight = 0;
        c.ipadx = 1;
        c.ipady = 1;
        c.insets = new Insets(3,3,3,3);
        c.fill = GridBagConstraints.BOTH;

        c.weightx = 0.1;
        c.weighty = 1;
        c.gridx = 0;
        c.gridy = 0;
        this.add(sidebar, c);

        c.weightx = 0.9;
        c.weighty = 1;
        c.gridx = 1;
        c.gridy = 0;
        this.add(currentEmployer, c);
    }

    public void addEmployer(Employer employer) {
        sidebar.addEmployer(employer);
    }
}
