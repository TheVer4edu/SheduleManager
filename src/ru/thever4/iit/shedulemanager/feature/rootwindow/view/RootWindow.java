package ru.thever4.iit.shedulemanager.feature.rootwindow.view;

import ru.thever4.iit.shedulemanager.feature.rootwindow.control.RootWindowController;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class RootWindow extends JFrame {

    private RootWindowController controller;

    public RootWindow(String title, int width, int height) {
        super(title);
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        this.setMinimumSize(new Dimension(width, height));
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocation((int) (d.getWidth() - width)/2, (int) (d.getHeight() - height)/2);

        setView();

        controller = new RootWindowController(this);
    }

    public RootWindow(String title) {
        super(title);
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        this.setMinimumSize(d);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setView();

        controller = new RootWindowController(this);
    }

    public void display() {
        this.setVisible(true);
    }

    public void addComponents(ArrayList<Component> components) {
        for(Component comp : components)
            this.add(comp);
    }

    private void setView() {
        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        this.setLayout(layout);
    }
}
