package ru.thever4.iit.shedulemanager.feature.rootwindow.view;

import ru.thever4.iit.shedulemanager.feature.registerschedule.view.RegisterScheduleFrame;
import ru.thever4.iit.shedulemanager.feature.rootwindow.control.RootWindowController;
import ru.thever4.iit.shedulemanager.feature.rootwindow.control.RootWindowView;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class RootWindow extends JFrame implements RootWindowView {
    private RootWindowController controller;

    public RootWindow(String title, int width, int height) {
        super(title);
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        this.setMinimumSize(new Dimension(width, height));
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocation((int) (d.getWidth() - width)/2, (int) (d.getHeight() - height)/2);

        controller = new RootWindowController(this);
    }

    public RootWindow(String title) {
        super(title);
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        this.setMinimumSize(d);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        controller = new RootWindowController(this);
    }

    public void addComponents(ArrayList<Component> components) {
        for(Component comp : components)
            this.add(comp);
    }

    @Override
    public void setView() {
        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints constraints = new GridBagConstraints();
        this.setLayout(layout);

        constraints.fill = GridBagConstraints.BOTH;
        constraints.weighty = 1;
        constraints.weightx = 1;
        this.add(new Button("I'm a top window"), constraints);

        constraints.weighty = 3;
        constraints.gridy = 1;
        this.add(new RegisterScheduleFrame(), constraints);

        this.setVisible(true);
    }
}
