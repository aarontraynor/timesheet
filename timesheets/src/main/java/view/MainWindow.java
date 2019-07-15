package view;

import javax.swing.*;

public class MainWindow extends JFrame {
    private JPanel mainPanel;

    public MainWindow(String name) {
        super(name);
        mainPanel = new JPanel();
        init();
    }

    public MainWindow(String name, JPanel mainPanel) {
        super(name);
        this.mainPanel = mainPanel;
        init();
    }

    private void init() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1280, 720);
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public void setMainPanel(JPanel mainPanel) {
        this.mainPanel = mainPanel;

    }
}
