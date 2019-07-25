package control;

import view.EmployerPanel;
import view.EmployersSidebar;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class EmployerSelectedListener implements ListSelectionListener {
    EmployerPanel linkedPanel;
    EmployersSidebar employerList;

    public EmployerSelectedListener(EmployerPanel linkedPanel, EmployersSidebar employerList) {
        this.linkedPanel = linkedPanel;
        this.employerList = employerList;
    }
    @Override
    public void valueChanged(ListSelectionEvent e) {
        linkedPanel.setName(employerList.getSelectedEmployerName());
        linkedPanel.setVisible(true);
    }
}
