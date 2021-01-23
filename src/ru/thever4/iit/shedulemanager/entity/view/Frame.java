package ru.thever4.iit.shedulemanager.entity.view;

import javax.swing.*;
import java.awt.*;

public class Frame extends JPanel {
    private JPanel toolBar;
    private JPanel body;

    protected void setup(JPanel toolBar, JPanel body) {
        this.toolBar = toolBar;
        this.body = body;

        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints constraints = new GridBagConstraints();

        this.setLayout(layout);

        constraints.weightx = 1;
        constraints.weighty = 1;
        constraints.fill = GridBagConstraints.BOTH;
        this.add(toolBar, constraints);

        constraints.gridx = 1;
        constraints.weightx = 5;
        this.add(body, constraints);
    }

    public JPanel getBody() {
        return body;
    }

    public JPanel getToolBar() {
        return toolBar;
    }
}
