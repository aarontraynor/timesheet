package view;

import model.Employer;

import javax.swing.*;
import java.awt.*;

public class EmployersSidebar extends JPanel {
    private JList employerList;
    private DefaultListModel<Employer> employerListModel;
    private JButton newEmployerButton;

    public EmployersSidebar() {
        super();
        init();
    }

    private void init() {
        employerListModel = new DefaultListModel<Employer>();
        employerList = new JList(employerListModel);

        newEmployerButton = new JButton("Add +");

        this.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.gridwidth = 0;
        c.gridheight = 1;
        c.ipadx = 1;
        c.ipady = 1;
        c.insets = new Insets(3,3,3,3);
        c.fill = GridBagConstraints.BOTH;

        c.weightx = 1;
        c.weighty = 0.98;
        c.gridx = 0;
        c.gridy = 0;
        this.add(employerList, c);

        c.weightx = 1;
        c.weighty = 0.02;
        c.gridx = 0;
        c.gridy = 1;
        this.add(newEmployerButton, c);
    }

    public void addEmployer(Employer employer) {
        employerListModel.addElement(employer);
    }
}
