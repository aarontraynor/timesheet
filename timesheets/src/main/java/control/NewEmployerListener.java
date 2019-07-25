package control;

import view.EmployerPanel;
import view.EmployersSidebar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class NewEmployerListener implements ActionListener {
    EmployerPanel linkedPanel;
    EmployersSidebar employerList;

    public NewEmployerListener(EmployerPanel linkedPanel, EmployersSidebar employerList) {
        this.linkedPanel = linkedPanel;
        this.employerList = employerList;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        linkedPanel.setName(employerList.getSelectedEmployerName());
    }
}
