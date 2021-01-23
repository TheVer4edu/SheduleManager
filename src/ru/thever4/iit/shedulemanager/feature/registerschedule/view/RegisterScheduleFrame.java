package ru.thever4.iit.shedulemanager.feature.registerschedule.view;

import ru.thever4.iit.shedulemanager.entity.view.Frame;
import ru.thever4.iit.shedulemanager.feature.registerschedule.control.RegisterScheduleController;
import ru.thever4.iit.shedulemanager.feature.registerschedule.control.RegisterScheduleView;

import javax.swing.*;
import java.awt.*;

import static java.awt.GridBagConstraints.*;

public class RegisterScheduleFrame extends Frame implements RegisterScheduleView {
    private RegisterScheduleController controller;

    public RegisterScheduleFrame() {
        super();
        controller = new RegisterScheduleController(this);
    }

    @Override
    public void setView() {
        super.setup(createToolBar(), createBody());
    }

    private JPanel createBody() {
        JPanel result = new JPanel();
        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints constraints = new GridBagConstraints();
        result.setLayout(layout);

        constraints.weightx = 2;
        constraints.weighty = 1;
        constraints.gridx = 1;
        constraints.fill = BOTH;
        result.add(new Button("I'm a body"), constraints);

        return result;
    }

    private JPanel createToolBar() {
        JPanel result = new JPanel();
        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints constraints = new GridBagConstraints();
        result.setLayout(layout);

        constraints.weightx = 1;
        constraints.weighty = 1;
        constraints.fill = BOTH;
        result.add(new Button("I'm a tool bar"), constraints);

        return result;
    }
}
