package ru.thever4.iit.shedulemanager.model;

import ru.thever4.iit.shedulemanager.model.enums.DayName;

import java.util.ArrayList;

public class WeekDay {
    private DayName weekDayName;
    private final ArrayList<Lesson> lessons;

    public WeekDay(DayName weekDayName) {
        this.weekDayName = weekDayName;
        this.lessons = new ArrayList<>();
    }


    public ArrayList<Lesson> getLessons() {
        return lessons;
    }

    public DayName getWeekDayName() {
        return weekDayName;
    }
}
