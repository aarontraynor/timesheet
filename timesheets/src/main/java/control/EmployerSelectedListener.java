package control;

import model.Shift;
import view.EmployerPanel;
import view.EmployersSidebar;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.sql.SQLException;
import java.util.ArrayList;

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
        try {
            ArrayList<Shift> shifts = DatabaseConnector.readShiftsFromEmployer(employerList.getSelectedEmployerID());
            String[][] tableData = new String[shifts.size()][5];

            for(int i=0;i<tableData.length;i++) {
                tableData[i] = shifts.get(i).getDataAsArray();
            }

            linkedPanel.updateTable(tableData);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
