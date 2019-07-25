package view;

import javax.swing.*;
import java.awt.*;

public class EmployerPanel extends JPanel {
    private JLabel title;
    private JTable shifts;

    public EmployerPanel() {
        super();
        init();
    }

    private void init() {
        title = new JLabel("-");
        shifts = new JTable();

        title.setVisible(false);
        shifts.setVisible(false);

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

        this.add(shifts, c);
    }

    public void setName(String name) {
        title.setText(name);
    }

    public void setVisible(boolean flag) {
        title.setVisible(flag);
        shifts.setVisible(flag);
    }
}
