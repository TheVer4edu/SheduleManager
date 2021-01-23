package ru.thever4.iit.shedulemanager;

import ru.thever4.iit.shedulemanager.entity.model.Lecturer;
import ru.thever4.iit.shedulemanager.entity.model.Lesson;
import ru.thever4.iit.shedulemanager.entity.model.Subject;
import ru.thever4.iit.shedulemanager.feature.rootwindow.view.RootWindow;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        setLookAndFeel();

        Lecturer lecturer = new Lecturer("Скрипов", "Сергей", "Александрович");
        Subject networks = new Subject("Сети и телекоммуникации");
        networks.addLecturer(lecturer);
        Lesson lesson = new Lesson(networks, 1);


        RootWindow rootWindow = new RootWindow("ScheduleManager");

    }

    private static void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (Exception ignored) { }
    }
}
