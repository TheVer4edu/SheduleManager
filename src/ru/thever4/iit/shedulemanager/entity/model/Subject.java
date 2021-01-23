package ru.thever4.iit.shedulemanager.entity.model;

import java.util.ArrayList;

public class Subject {
    private String name;
    private final ArrayList<Lecturer> lecturers;

    public Subject(String name) {
        this.lecturers = new ArrayList<>();
        this.name = name;
    }

    public void addLecturer(Lecturer lecturer) {
        this.lecturers.add(lecturer);
    }

    public ArrayList<Lecturer> getLecturers() {
        return lecturers;
    }

    public Lecturer getLecturer(int i) {
        return lecturers.get(i);
    }

    public Lecturer removeLecturer(int i) {
        return lecturers.remove(i);
    }

    @Override
    public String toString() {
        return this.name;
    }
}
