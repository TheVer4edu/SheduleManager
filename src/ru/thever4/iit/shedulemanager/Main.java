package ru.thever4.iit.shedulemanager;

import ru.thever4.iit.shedulemanager.model.Lecturer;
import ru.thever4.iit.shedulemanager.model.Lesson;
import ru.thever4.iit.shedulemanager.model.Subject;
import ru.thever4.iit.shedulemanager.view.Window;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        setLookAndFeel();

        Lecturer lecturer = new Lecturer("Скрипов", "Сергей", "Александрович");
        Subject networks = new Subject("Сети и телекоммуникации");
        networks.addLecturer(lecturer);
        Lesson lesson = new Lesson(networks, 1);


        Window window = new Window("SheduleManager");

        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        window.setLayout(layout);



        window.display();

    }

    private static void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (Exception ignored) { }
    }
}
