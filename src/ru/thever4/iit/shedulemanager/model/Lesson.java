package ru.thever4.iit.shedulemanager.model;

import ru.thever4.iit.shedulemanager.model.enums.Subgroup;

public class Lesson {
    private int number;
    private Subgroup subgroup;
    private String hall;
    private Subject subject;
    private Lecturer lecturer;

    public Lesson(Subject subject, int number) {
        this.subject = subject;
        this.number = number;
    }

    public Lesson(Subject subject, int number, Subgroup subgroup) {
        this.subject = subject;
        this.number = number;
        this.subgroup = subgroup;
    }

    public void setLecturer(int i) {
        this.lecturer = this.subject.getLecturer(i);
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

    public void setHall(String hall) {
        this.hall = hall;
    }

    public int getNumber() {
        return number;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }
}
