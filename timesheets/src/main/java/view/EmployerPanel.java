package view;

import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;

public class EmployerPanel extends JPanel {
    private JLabel title;
    private JTable shifts;
    private JScrollPane shiftScrollPane;
    private String[] columnNames;

    public EmployerPanel() {
        super();
        init();
    }

    private void init() {

        columnNames = new String[] {"START_DATE", "START_TIME", "END_DATE", "END_TIME", "DURATION"};

        title = new JLabel("-");
        shifts = new JTable();
        shiftScrollPane = new JScrollPane(shifts);

        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("Start Date");
        tableModel.addColumn("Start Time");
        tableModel.addColumn("End Date");
        tableModel.addColumn("End Time");
        tableModel.addColumn("Duration");
        shifts.setModel(tableModel);

        title.setVisible(false);
        shiftScrollPane.setVisible(false);

        this.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.gridheight = 1;
        c.gridwidth = 0;
        c.ipadx = 3;
        c.ipady = 3;
        c.fill = GridBagConstraints.BOTH;

        c.weightx = 1;
        c.weighty = 0.02;
        c.gridx = 0;
        c.gridy = 0;
        this.add(title, c);

        c.weightx = 1;
        c.weighty = 0.98;
        c.gridx = 0;
        c.gridy = 1;
        this.add(shiftScrollPane, c);
    }

    public void setName(String name) {
        title.setText(name);
    }

    public void setVisible(boolean flag) {
        title.setVisible(flag);
        shiftScrollPane.setVisible(flag);
    }

    public void updateTable(String[][] tableData) {
        DefaultTableModel tableModel = (DefaultTableModel) shifts.getModel();

        tableModel.setRowCount(0);

        for(int i=0;i<tableData.length;i++) {
            tableModel.addRow(tableData[i]);
        }

        tableModel.fireTableDataChanged();
    }
}
